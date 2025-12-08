package com.krakedev.estaticos;

public class Calculos {
	//final hace que el valor no se puedan cambiar
	//esto covierte la variable en constante
	private final double IVA = 12;
	
	public double calcularIVA(double monto) {
		return monto*IVA/100;
	}

}
