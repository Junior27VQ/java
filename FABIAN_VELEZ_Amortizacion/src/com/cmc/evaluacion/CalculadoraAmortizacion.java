package com.cmc.evaluacion;

import java.text.DecimalFormat;
import java.util.ArrayList;

import com.cmc.entidades.Cuota;

public class CalculadoraAmortizacion {
	
	public static double calcularCuota(Prestamo cliente) {
		double monto=cliente.getMonto();//capital prestado
		double interes=cliente.getInteres();//interes del periodo
		int plazo=cliente.getPlazo();//numero de periodos(plazo)
		
		double co=monto;
		double i=(interes/100)/12.0;
		int n=plazo;
		double base=1.0+i;
		double ex=Math.pow(base, -n);//exponente
		
		double numerador=(co*i);
		double denominador=1.0-ex;
		
		double cuotas=numerador/denominador;
		return cuotas;
	}
	public void calcularValoresCuota(double interesAnual, Cuota cuota) {
		double interesMensual=interesAnual;
		double interesPerdido=cuota.getInicio()*interesMensual;
		cuota.setInteres(interesPerdido);
		double abonoCapital=cuota.getCuota()-interesPerdido;
		cuota.setAbonoCapital(abonoCapital);
		double saldoFinal=cuota.getInicio()-abonoCapital;
		cuota.setSaldo(saldoFinal);
	}
	public void generarTabla(Prestamo prestamo) {
		double monto=prestamo.getMonto();
		double interes=prestamo.getInteres()/12.0;
		double interesMensual=interes/100.0;
		int plazo=prestamo.getPlazo();
		
		double valorConstante=calcularCuota(prestamo);
		double saldoPendiente=monto;
		ArrayList<Cuota> arreglo=prestamo.getCuota();
		for(int i=0; i<plazo; i++) {
			int numCuota=i+1;
			Cuota cuotaActual=new Cuota(numCuota);
			cuotaActual.setCuota(valorConstante);
			cuotaActual.setInicio(saldoPendiente);
	
			this.calcularValoresCuota(interesMensual, cuotaActual);
			
			if(numCuota==plazo) {
				double interesFinal=cuotaActual.getInicio()*interesMensual;
				double abonoFinal=cuotaActual.getCuota()-interesFinal;
				cuotaActual.setAbonoCapital(abonoFinal);
				cuotaActual.setSaldo(0.0);
			}
			arreglo.add(cuotaActual);
			saldoPendiente=cuotaActual.getSaldo();
			
		}
		
	}
	public static void mostrarTabla(Prestamo prestamo) {
		Utilitario nr=new Utilitario();
		System.out.println("===============================");
		System.out.println(" TABLA DE AMORTIZACION " );
		System.out.println("===============================");
		System.out.println("Monto Prestamo: "+nr.redondear(prestamo.getMonto()));
		System.out.println("Plazo mes: "+nr.redondear(prestamo.getPlazo()));
		System.out.println("Interes Anual: "+nr.redondear(prestamo.getInteres()));
		System.out.println("Cuota Fija: "+nr.redondear(calcularCuota(prestamo)));
		System.out.println("------------------------------------ ");
		System.out.printf("%-5s %-15s %-15s %-15s %-15s %-15s%n","NUMERO","CUOTA","INICIO","INTERES","ABONO","SALDO");
		System.out.println("------------------------------------ ");
		ArrayList<Cuota> cuotas=prestamo.getCuota();
		DecimalFormat df=new DecimalFormat("0.00");
		for(int i=0; i<cuotas.size(); i++) {
			Cuota c=cuotas.get(i);
			System.out.printf("%-5s %-15s %-15s %-15s %-15s %-15s%n",
					df.format(i+1),
					df.format(c.getCuota()),
					df.format(c.getInicio()),
					df.format(c.getInteres()),
					df.format(c.getAbonoCapital()),
					df.format(c.getSaldo())
					);
		}
		System.out.printf("======================================");
	}

}
