package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calc=new Calculadora();
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromedio;
		
		resultadoSuma=calc.sumar(5, 3);
		resultadoResta=calc.restar(10, 3);
		resultadoMultiplicar=calc.multiplicar(25.40, 5.20);
		resultadoDividir=calc.dividir(125.00, 2.00);
		resultadoPromedio=calc.promedio(10, 07, 05);
		calc.mostrarResultado();
		
		System.out.println("RESULTADO SUMA: "+resultadoSuma);
		System.out.println("RESULTADO RESTA: "+resultadoResta);
		System.out.println("RESULTADO MULTIPLICAR: "+resultadoMultiplicar);
		System.out.println("RESULTADO DIVIDIR: "+resultadoDividir);
		System.out.println("RESULTADO PROMEDIO: "+resultadoPromedio);

	}

}
