package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefonos;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		AdminTelefonos at=new AdminTelefonos();
		Telefono telf=new Telefono("movil","098234234",20);
		at.activarMensajeria(telf);
		System.out.println("Opreador: "+telf.getOperador()+" Numero: "+telf.getNumero()+" codigo: "+telf.getCodigo()+" Tiene Watsapp: "+telf.isTieneWatsapp());
		

	}

}
