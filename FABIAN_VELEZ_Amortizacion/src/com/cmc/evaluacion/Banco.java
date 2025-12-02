package com.cmc.evaluacion;

import java.util.ArrayList;

import com.cmc.entidades.Cliente;

public class Banco {
	private ArrayList<Prestamo> prestamo;
	private ArrayList<Cliente> clientes;
	
	public Banco() {
		this.prestamo=new ArrayList<Prestamo>();
		this.clientes=new ArrayList<Cliente>();
	}
	//====================================================
	public Cliente buscarCliente(String cedula) {
		for(Cliente c:this.clientes) {
			if(c.getCedula().equals(cedula)) {
			    return c;
			}
		}
		return null;
	}
	public void registrarCliente(Cliente cliente) {
		Cliente nuevoCliente=buscarCliente(cliente.getCedula());
		if(nuevoCliente==null) {
			this.clientes.add(cliente);
		}else {
			System.out.println("Cliente ya existe: "+cliente.getCedula());
		}
	}
	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Cliente cliente =buscarCliente(cedula);
		if(cliente==null) {
			System.out.println("No es cliente del banco");
			
		}else {
			cliente.getPrestamos().add(prestamo);
			this.prestamo.add(prestamo);
			
		}
	}
	public ArrayList<Prestamo> buscarPrestamos(String cedula){
		Cliente encontrado=buscarCliente(cedula);
			if(encontrado!=null) {
			    ArrayList<Prestamo> lista=encontrado.getPrestamos();
			    if(lista.isEmpty()) {
			    	return null;
			    }else {
			    return lista;
			    }
		}else {
			return null;
		}
	}
	//================================================
	public ArrayList<Prestamo> getPrestamo() {
		return prestamo;
	}
	public void setPrestamo(ArrayList<Prestamo> prestamo) {
		this.prestamo = prestamo;
	}
	public ArrayList<Cliente> getCliente() {
		return clientes;
	}
	public void setCliente(ArrayList<Cliente> cliente) {
		this.clientes = cliente;
	}
	

}
