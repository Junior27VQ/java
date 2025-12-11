package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestActualizar {

	public static void main(String[] args) {
		
		Persona p=new Persona();
		
		try {
			p.setNombre("Dilan");
			p.setApellido("Cedeño");
			p.setCedula("0987412562");
			AdminPersonas.actualizar(p);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}

	}

}
