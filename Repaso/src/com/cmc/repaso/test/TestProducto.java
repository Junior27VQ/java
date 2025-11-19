package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto=new Producto("Shampoo",24.75);
		producto.calcularPrecioPromo(25);
		producto.setPrecio(15);
		

	}

}
