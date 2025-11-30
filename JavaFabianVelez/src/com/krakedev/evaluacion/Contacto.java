package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefono;
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono=new ArrayList<Telefono>();
	}
	
	public void imprimir() {
		if(direccion!=null) {
		System.out.println("***"+nombre+" "+apellido+"****");
		System.out.println(direccion.getCallePrincipal()+"  y "+direccion.getCalleSecundaria());
		}else {
			System.out.println("***"+nombre+" "+apellido+"****");
			System.out.println("No tiene asociada una dirección");
		}
	}
	public void agregarTelefono(Telefono telefono) {
		String nuevoNumero=telefono.getNumero();
		for(Telefono telf : this.telefono) {
			String numero=telf.getNumero();
			if(numero.equalsIgnoreCase(nuevoNumero)) {
				System.out.println("El telefono ("+telefono.getNumero()+") ya existe");
				return;
			}
		}
		this.telefono.add(telefono);
	}
	public void mostrarTelefonos() {
		System.out.println("El telefono con estado 'C':");
		for(Telefono telf:this.telefono) {
			if(telf.getEstado().equals("C")) {
				System.out.println("Número "+telf.getNumero()+" Tipo: "+telf.getTipo());
			}
		}
	}
	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> telef=new ArrayList<Telefono>();
		for(Telefono telf:this.telefono) {
			if(telf.getEstado().equalsIgnoreCase("E")) {
				telef.add(telf);
			}
		}
		return telef;
	}
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefono() {
		return telefono;
	}

	public void setTelefono(ArrayList<Telefono> telefono) {
		this.telefono = telefono;
	}
	

}
