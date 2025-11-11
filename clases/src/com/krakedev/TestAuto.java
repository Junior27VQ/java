package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		auto1.marca ="Chevrolet";
		auto1.anio = 2020;
		auto1.precio =45000.78;
		System.out.println("Marca: "+auto1.marca+" Anio: "+auto1.anio+" Precio: "+auto1.precio);
		auto2.marca="Aveo";
		auto2.anio=2015;
		auto2.precio=5000.00;
		System.out.println("Marca: "+auto2.marca+" Anio: "+auto2.anio+" Precio: "+auto2.precio);
		
	}

}
