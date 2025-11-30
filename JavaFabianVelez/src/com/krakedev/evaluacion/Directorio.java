package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;
	
	public Directorio() {
		this.contactos=new ArrayList<Contacto>();
		this.fechaModificacion=null;
	}
	public boolean agregarContacto(Contacto cont) {
		String cedula=cont.getCedula();
		Contacto buscar=buscarPorCedula(cedula);
		if(buscar==null) {
			this.contactos.add(cont);
			this.fechaModificacion=new Date();
			return true;
		}else {
		    return false;
		}
		
	}
	public Contacto buscarPorCedula(String cedula) {
		Contacto contactoEncontrado=null;
		for(Contacto cont:this.contactos) {
			if(cedula.equals(cont.getCedula())) {
				contactoEncontrado=cont;
			}
		}
		return contactoEncontrado;
	}
	public String consultarUltimaModificacion() {
		if(this.fechaModificacion==null) {
			return "El directorio nunca a sido modificado.";
		}
		SimpleDateFormat formato=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String fechaFormateada=formato.format(this.fechaModificacion);
		return fechaFormateada;
	}
	public int contarPerdidos() {
		ArrayList<Contacto> sinDireccion=new ArrayList<Contacto>();
		for(Contacto cont:this.contactos) {
			if(cont.getDireccion()==null) {
				sinDireccion.add(cont);
			}
		}return sinDireccion.size();
	}
	public int contarFijos() {
		int contador=0;
		for(Contacto telf:this.contactos) {
			ArrayList<Telefono> fijo=telf.getTelefono();
			boolean contado=false;
			if(fijo!=null) {
				for(Telefono telefono:fijo) {
					if(telefono.getTipo().equalsIgnoreCase("Convencional") && telefono.getEstado().equalsIgnoreCase("C")) {
						contador++;
						contado=true;
						break;
					}
				}
			}
		}
	return contador;
	}
	public void depurar() {
		ArrayList<Contacto> correctos=new ArrayList<Contacto>();
		ArrayList<Contacto> incorrectos=new ArrayList<Contacto>();
		for(Contacto cont:this.contactos) {
			if(cont.getDireccion()!=null) {
				correctos.add(cont);
				this.correctos=correctos;
			    
			}else {
				incorrectos.add(cont);
				this.incorrectos=incorrectos;
				
			}
			
		}
		contactos.clear();
	}
	 
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}
	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}
	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}
	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
	

}
