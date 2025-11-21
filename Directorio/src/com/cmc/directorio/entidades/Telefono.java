package com.cmc.directorio.entidades;

public class Telefono {
	private String operador;
	private String numero;
	private int codigo;
	private boolean tieneWatsapp;
	public Telefono(String operador, String numero, int codigo) {
		this.operador = operador;
		this.numero = numero;
		this.codigo = codigo;
		tieneWatsapp=false;
	}
	public String getOperador() {
		return operador;
	}
	public String setOperador(String operador) {
		return this.operador = operador;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public boolean isTieneWatsapp() {
		return tieneWatsapp;
	}
	public boolean setTieneWatsapp(boolean tieneWatsapp) {
		this.tieneWatsapp = tieneWatsapp;
		return tieneWatsapp;
	}
	

}
