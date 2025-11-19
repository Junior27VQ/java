package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public void imprimir() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Productos Actuales : "+productosActuales);
		System.out.println("Porductos Devueltos : "+productosDevueltos);
		System.out.println("Productos Vendidos: "+productosVendidos);
	}
	public void vender(int productosVendidos) {
		this.productosActuales=productosActuales-productosVendidos;
		this.productosVendidos+=productosVendidos;
	}
	public void devolver(int productosDevueltos) {
		this.productosActuales=productosActuales+productosDevueltos;
		this.productosVendidos=productosVendidos-productosDevueltos;
		this.productosDevueltos+=productosDevueltos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public int getProductosDesvueltos() {
		return productosDevueltos;
	}
	public void setProductosDesvueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	public int getProductosVandidos() {
		return productosVendidos;
	}
	public void setProductosVandidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	

}
