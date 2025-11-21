package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movil","09941234123",10);
		System.out.println("Codigo: "+telf.getCodigo()+", Numero: "+telf.getNumero()+", Operador: "+telf.getOperador());
	}

}
