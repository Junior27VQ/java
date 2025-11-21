package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movi","0914523698",258);
		telf.setTieneWatsapp(true);
		Contacto c1=new Contacto("Karlos","Echeveria",telf,125.25);
		
		AdminContacto adm=new AdminContacto();
		adm.actibarUsuario(c1);
		System.out.println("contacto : "+c1.getActivo());

	}

}
