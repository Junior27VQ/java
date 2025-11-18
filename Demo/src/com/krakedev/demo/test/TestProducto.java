package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto=new Producto(123,"Fabian");
		String descripcion;
		double peso;
		descripcion=producto.setDescripcion("jove pelos negro de ojos caltaños");
		peso=producto.setPeso(1.70);
		
		System.out.println("codigo: "+producto.getCodigo()+" nombre: "+producto.getNombre());
		System.out.println("descripcion: "+producto.getDescripcion()+" peso: "+producto.getPeso());
		System.out.println("descripcion: "+descripcion+" peso: "+peso);

	}

}
