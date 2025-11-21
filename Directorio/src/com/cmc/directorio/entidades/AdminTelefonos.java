package com.cmc.directorio.entidades;

public class AdminTelefonos {
	public void activarMensajeria(Telefono telf) {
		if(telf.getOperador().equalsIgnoreCase("movil")) {
			telf.setTieneWatsapp(true);
		}
	}
	public int contarMovil(Telefono t1, Telefono t2, Telefono t3) {
		int contador = 0;
		if(t1.getOperador().equalsIgnoreCase("movi")) {
			contador++;
		}
		if(t2.getOperador().equalsIgnoreCase("movi")) {
			contador++;
		}
		if(t3.getOperador().equalsIgnoreCase("movi")) {
			contador++;
		}
		return contador;
	}
	public int contarClaro(Telefono t1, Telefono t2, Telefono t3, Telefono t4) {
		int contador = 0;
		if(t1.getOperador().equalsIgnoreCase("claro")) {
			contador++;
		}
		if(t2.getOperador().equalsIgnoreCase("claro")) {
			contador++;
		}
		if(t3.getOperador().equalsIgnoreCase("claro")) {
			contador++;
		}
		if(t4.getOperador().equalsIgnoreCase("claro")) {
			contador++;
		}
		return contador;
	}
	

}
