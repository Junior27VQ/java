package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		String cedula="0987654321";
		
		try {
			AdminPersonas.eliminar(cedula);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
