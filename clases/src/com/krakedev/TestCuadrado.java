package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado ca1=new Cuadrado();
		Cuadrado ca2=new Cuadrado();
		Cuadrado ca3=new Cuadrado();
		Cuadrado cp1=new Cuadrado();
		Cuadrado cp2=new Cuadrado();
		Cuadrado cp3=new Cuadrado();
		double areaC1;
		double areaC2;
		double areaC3;
		double perimetroC1;
		double perimetroC2;
		double perimetroC3;
		
		ca1.lado=4;
		ca2.lado=6;
		ca3.lado=8;
		cp1.lado=3;
		cp2.lado=2;
		cp3.lado=1;
		
		areaC1=ca1.calcularArea();
		areaC2=ca2.calcularArea();
		areaC3=ca3.calcularArea();
		perimetroC1=cp1.calcularPerimetro();
		perimetroC2=cp2.calcularPerimetro();
		perimetroC3=cp3.calcularPerimetro();
		
		System.out.println("Area del cuadrado: "+areaC1);
		System.out.println("Area del cuadrado: "+areaC2);
		System.out.println("Area del cuadrado: "+areaC3);
		System.out.println("Perimetro del cuadrado; "+perimetroC1);
		System.out.println("Perimetro del cuadrado; "+perimetroC2);
		System.out.println("Perimetro del cuadrado; "+perimetroC3);

	}

}
