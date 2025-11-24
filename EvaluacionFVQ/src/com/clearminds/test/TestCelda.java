package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {

	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		System.out.println(celda.getProducto().getNombre());/*En esta linea
		se genera un NullPinterException y la variable que lo genera es despues
		del punto el getProducto es null por lo que no tiene un valor que mostrar
		*/ 
		
		System.out.println("CELDA: "+celda.getProducto());
		System.out.println("Nombre Producto: "+celda.getProducto().getNombre());
		System.out.println("Precio Producto: "+celda.getProducto().getPrecio());
		System.out.println("Codigo Producto: "+celda.getProducto().getCodigo());
		System.out.println("STOCK: "+celda.getStock());
		System.out.println("************************************************");
	}

}
