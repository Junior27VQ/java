package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		auto1.setMarca("Chevrolet");
		auto1.setAnio(2020);
		auto1.setPrecio(45000.78);
		
		System.out.println("Marca: "+auto1.getMarca()+" Anio: "+auto1.getAnio()+" Precio: "+auto1.getPrecio());
		auto2.setMarca("Aveo");
		auto2.setAnio(2015);
		auto2.setPrecio(5000.00);
		System.out.println("Marca: "+auto2.getMarca()+" Anio: "+auto2.getAnio()+" Precio: "+auto2.getPrecio());
		
	}

}
