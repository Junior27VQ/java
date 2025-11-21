package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefonos;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("movi","0921457896",700);
		Telefono telf2=new Telefono("claro","0981254687",100);
		Telefono telf3=new Telefono("claro","0925648952",350);
		Telefono telf4=new Telefono("movi","0921356489",8000);
		AdminTelefonos admin=new AdminTelefonos();
		int totalClaro = admin.contarClaro(telf1, telf2, telf3, telf4);
		System.out.println("El total de telefonos claro es: "+totalClaro);


	}

}
