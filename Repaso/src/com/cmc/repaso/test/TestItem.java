package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item producto=new Item();
		Item productos=new Item();
		producto.setNombre("Shampoo");
		producto.setProductosActuales(20);
		
		producto.imprimir();
		
		productos.setNombre("Jabom");
		productos.setProductosActuales(25);
		productos.vender(10);
		productos.devolver(5);
		
		productos.imprimir();

	}

}
