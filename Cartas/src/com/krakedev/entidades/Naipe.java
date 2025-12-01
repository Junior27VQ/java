package com.krakedev.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numeroPosible;
	private ArrayList<Carta> carta;
		
	public Naipe() {
		this.numeroPosible=new ArrayList<>();
		this.carta=new ArrayList<>();
		
		this.numeroPosible.add(new Numero("A",11));
		for(int i=2; i<=10; i++) {
			this.numeroPosible.add(new Numero(String.valueOf(i),i));
		}
		this.numeroPosible.add(new Numero("J",10));
		this.numeroPosible.add(new Numero("Q",10));
		this.numeroPosible.add(new Numero("K",10));
		
		String[] palos = {"Corazones", "Diamantes", "Tableros", "Picas"};
		for(String palo : palos) {
			for(Numero numero : this.numeroPosible) {
				Carta cartaNueva = new Carta(numero, palo);
				this.carta.add(cartaNueva);
			}
		}
	}
	public ArrayList<Carta> baraja(){
		ArrayList<Carta> auxiliar=new ArrayList<Carta>();
		int numCartas=this.carta.size();
		for(int i=0; i<100; i++) {
			int posicion= (int) (Math.random()*numCartas);
			Carta encontrarCarta=this.carta.get(posicion);
			if(encontrarCarta.getEstado().equalsIgnoreCase("N")) {
				auxiliar.add(encontrarCarta);
				encontrarCarta.setEstado("C");
			}
			if(auxiliar.size()==numCartas) {
				break;
			}
		}
		for(Carta carta:this.carta) {
			if(carta.getEstado().equalsIgnoreCase("N")) {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}
		return auxiliar;
	}

	public ArrayList<Carta> getCarta(){
		return carta;
	}

}
