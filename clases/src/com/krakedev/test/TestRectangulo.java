package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		Rectangulo p=new Rectangulo();
		int areaR1;
		int areaR2;
		double perimetro;
		
		r1.setBase(10);
		r1.setAltura(5);
		r2.setBase(8);
		r2.setAltura(3);
		p.setBase(4);
		p.setAltura(2);
		
		areaR1=r1.calcularArea();
		areaR2=r2.calcularArea();
		perimetro=p.CalcularPerimetro();
		
		System.out.println("Area de r1: "+areaR1);
		System.out.println("Area de r2: "+areaR2);
		System.out.println("Perimetro: "+perimetro);
	}

}
