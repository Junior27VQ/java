package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaPersonas {

	public static void main(String[] args) {
		String nombre = "a";
		try {
			ArrayList<Persona> persona=AdminPersonas.buscarPorNombre(nombre);
			System.out.println(persona);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
