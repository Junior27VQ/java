package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticoscom.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		Alarma alarma1=new Alarma(DiasSemana.LUNES,5,45);
		Alarma alarma2=new Alarma(DiasSemana.MIERCOLES,12,35);
		Alarma alarma3=new Alarma(DiasSemana.SABADO,20,45);
		AdminAlarmas admin=new AdminAlarmas();
		admin.agregarAlarma(alarma1);
		admin.agregarAlarma(alarma2);
		admin.agregarAlarma(alarma3);
		ArrayList<Alarma> alarmasActuales = admin.getAlarma();
		System.out.println(alarmasActuales);

	}

}
