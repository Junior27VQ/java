package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefonos;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telfA=new Telefono("movi","0991111111",100);
		Telefono telfB=new Telefono("claro","0982222222",200);
		Telefono telfC=new Telefono("movi","0963333333",300);
		AdminTelefonos admin=new AdminTelefonos();
		int totalMovi = admin.contarMovil(telfA, telfB, telfC);
		System.out.println("El total de telefonos movi es: "+totalMovi);

	}

}
