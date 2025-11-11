package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		productoA.nombre="Crema Dental";
		productoA.descripcion="Triple Accion";
		productoA.precio=2.99;
		productoA.stockActual=25;
		System.out.println("ProductoA: "+productoA.nombre+", "+productoA.descripcion+": $"+productoA.precio+" - "+productoA.stockActual);
		productoB.nombre="Ensure Advance";
		productoB.descripcion="Chocolate 400G";
		productoB.precio=20.34;
		productoB.stockActual=35;
		System.out.println("ProductoB: "+productoB.nombre+", "+productoB.descripcion+": $"+productoB.precio+" - "+productoB.stockActual);
		productoC.nombre="Pedialyte";
		productoC.descripcion="Uva 500ML";
		productoC.precio=25.45;
		productoC.stockActual=50;
		System.out.println("ProductoC: "+productoC.nombre+", "+productoC.descripcion+": $"+productoC.precio+" - "+productoC.stockActual);
		

	}

}
