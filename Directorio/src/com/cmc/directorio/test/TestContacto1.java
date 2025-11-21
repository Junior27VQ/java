package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movi","0932654125",25);
		Contacto c=new Contacto("Jose", "Prado", telf, 164);
		System.out.println("Informacion de contacto: ");
		System.out.println("Nombre y Apellido: "+c.getNombre()+"  "+c.getApellido()
		+": Telefono: operadora: "+telf.getOperador()+", numreo: "+telf.getNumero());
		

	}

}
