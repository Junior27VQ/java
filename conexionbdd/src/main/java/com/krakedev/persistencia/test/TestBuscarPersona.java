package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscarPersona {

	public static void main(String[] args) {
		String nombre = "Jose";
		String apellido = "Rey";
		String codigo = "U";
		
		try {
			ArrayList<Persona> persona=AdminPersonas.buscarPersona(nombre, apellido, codigo);
			System.out.println(persona);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
