package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		Auto auto3=new Auto("bugati");
		Auto auto4=new Auto("Ferrary",2025,1258.36);
		System.out.println("Marca: "+auto3.getMarca()+" Anio: "+auto3.getAnio()+" Precio: "+auto3.getPrecio());
		System.out.println("Marca: "+auto4.getMarca()+" Anio: "+auto4.getAnio()+" Precio: "+auto4.getPrecio());
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
