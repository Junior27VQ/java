package com.clearminds.test;

import com.clearminds.componentes.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto=new Producto("KE34","Papitas",0.85);
		System.out.println(producto.getCodigo()+" "+producto.getNombre()+" "+producto.getPrecio());
		
		producto.setPrecio(0.9);
		System.out.println("Nuevo Precio "+producto.getPrecio());
		producto.incrementarPrecio(50);
		System.out.println("Precio Incrementado "+producto.getPrecio());
		producto.disminuirPrecio(0.5);
		System.out.println("Precio Incrementado "+producto.getPrecio());

	}

}
