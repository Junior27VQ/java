package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscarCedula {

	public static void main(String[] args) {
		String nombre = "0987654321";
		try {
			Persona persona=AdminPersonas.buscarPorCedula(nombre);
			System.out.println(persona);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
