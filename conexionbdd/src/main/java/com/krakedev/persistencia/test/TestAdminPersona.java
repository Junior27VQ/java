package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec=new EstadoCivil("U","Union Libre");
		Persona p=new Persona("0987412562","Dario","Ramires",ec);
		try {
			Date fechaN=Convertidor.convertirFecha("2020/05/25");
			Date horaN=Convertidor.convertirHora("08:28");
			p.setFechaNacimiento(fechaN);
			p.setHoraNacimiento(horaN);
			p.setCantidadAhorrada(new BigDecimal(125.25));
			p.setNumeroHijo(10);
			p.setEstatura(1.64);
			
			AdminPersonas.insertar(p);
		} catch (Exception e) {
			// logear el error
			System.out.println(e.getMessage());
		}
		
		

	}

}
