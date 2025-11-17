package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1=new Fecha();
		Fecha fecha2=new Fecha(1952);
		Fecha fecha3=new Fecha(1258,12,31);
		
		fecha1.setAnio(2000);
		fecha1.setMes(12);
		fecha1.setDia(15);
		
		System.out.println(fecha1.getAnio());
		System.out.println(fecha2.getAnio());
		System.out.println("Anio: "+fecha3.getAnio()+" Mes: "+fecha3.getMes()+" Dia: "+fecha3.getDia());
	}

}
