package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		productoA.setNombre("Crema Dental");
		productoA.setDescripcion("Triple Accion");
		productoA.setPrecio(2.99);
		productoA.setStockActual(25);
		System.out.println("ProductoA: "+productoA.getNombre()+", "+productoA.getDescripcion()+": $"+productoA.getPrecio()+" - "+productoA.getStockActual());
		productoB.setNombre("Ensure Advance");
		productoB.setDescripcion("Chocolate 400G");
		productoB.setPrecio(20.34);
		productoB.setStockActual(35);
		System.out.println("ProductoB: "+productoB.getNombre()+", "+productoB.getDescripcion()+": $"+productoB.getPrecio()+" - "+productoB.getStockActual());
		productoC.setNombre("Pedialyte");
		productoC.setDescripcion("Uva 500ML");
		productoC.setPrecio(25.45);
		productoC.setStockActual(50);
		System.out.println("ProductoC: "+productoC.getNombre()+", "+productoC.getDescripcion()+": $"+productoC.getPrecio()+" - "+productoC.getStockActual());
		

	}

}
