package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	public ArrayList<Alarma> alarma;
	
	public AdminAlarmas() {
		this.alarma = new ArrayList<Alarma>();
	}
	public void agregarAlarma(Alarma alarma) {
		this.alarma.add(alarma);
	}
	public ArrayList<Alarma> getAlarma(){
		return this.alarma;
	}

}
