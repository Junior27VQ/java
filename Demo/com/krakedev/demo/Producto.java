package com.krakedev.demo;

public class Producto {
	private int codigo;
	private String nombre;
	private String descripcion;
	private double peso;
	
	public Producto(int codigo, String nombre) {
		this.codigo=codigo;
		this.nombre=nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String setDescripcion(String descripcion) {
		return this.descripcion = descripcion;
	}
	public double getPeso() {
		return peso;
	}
	public double setPeso(double peso) {
		return this.peso = peso;
	}
	
	

}
