package com.krakedev.estaticos;

public class Utilitarios {
	public static boolean validarPago(int valor) {
		if(valor>=0 && valor<=10) {
			return true;
		}else {
			return false;
		}

	}

}
