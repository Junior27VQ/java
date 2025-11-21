package com.cmc.directorio.entidades;

public class AdminContacto {
	
	public Contacto buscarMasPeso(Contacto c1, Contacto c2) {
		if(c1.getPeso()>c2.getPeso()) {
			return c1;
			
		}else {
			return c2;
		}
	}
	public boolean compararOperadoras(Contacto c1, Contacto c2) {
		String op1= c1.getTelefono().getOperador();
		String op2= c2.getTelefono().getOperador();
		if(op1==op2) {
			return true;
		}else {
		return false;
		}
	}
	public void actibarUsuario(Contacto c) {
		boolean valido= c.getTelefono().isTieneWatsapp();
		if(valido==true) {
			c.setActivo(true);
		}
	}
	

}
