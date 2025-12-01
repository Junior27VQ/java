package com.krakedev.servicios;

import java.util.ArrayList;

public class Jugadores {
	private ArrayList<String> jugadores;
	private Juego juego;

	public Jugadores() {
		this.jugadores = new ArrayList<String>();
	}
	public void jugarPrimero() {
		ArrayList<String> listaNombre = new ArrayList<>();
		ArrayList<String> resultado = new ArrayList<>();
		listaNombre.add("Jugador A");
		listaNombre.add("Jugador B");
		listaNombre.add("Jugador C");
		this.setJugadores(listaNombre);
		Juego juego=new Juego(this.getJugadores());
		this.juego=juego;
		int repartirCartas = 5;
		juego.entregarCartas(repartirCartas);
		
		
		for(int i=0; i<resultado.size(); i++) {
			System.out.println("Resultado "+(i+1)+" : "+resultado.get(i));
		}
		String ganador=juego.determinarGanador();
		System.out.println("El ganador es: "+ganador);
	}

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	public Juego getJuego() {
		return juego;
	}
	public void setJuego(Juego juego) {
		this.juego = juego;
	}
	

}
