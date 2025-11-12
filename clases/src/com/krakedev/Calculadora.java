package com.krakedev;

public class Calculadora {
	public int sumar (int valor1, int valor2) {
		int resultado;// Declarar la variable
		resultado = valor1 + valor2;
		return resultado;
	}
	public int restar (int valor1, int valor2) {
		int resultado = valor1 - valor2;
		return resultado;
	}
	public double multiplicar (double valor1, double valor2) {
		double resultado = valor1 * valor2;
		return resultado;
	}
	public double dividir (double dividendo, double divisor) {
		double resultado = dividendo / divisor;
		return resultado;
	}
	public double promedio (double valor1, double valor2, double valor3) {
		double suma = valor1 + valor2 + valor3;
		double resultado = suma / 3;
		return resultado;
	}
	public void mostrarResultado () {
		System.out.println("Ahorita no joven, sali al almuerzo. Regreso en 15 minutos");
	}

}
