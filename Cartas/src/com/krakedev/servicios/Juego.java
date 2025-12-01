package com.krakedev.servicios;

import java.util.ArrayList;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> catasJugador;
	private ArrayList<String> ids;
	private ArrayList<Carta> naipeBarajeado;
	
	public Juego() {
		this.naipe=new Naipe();
		this.naipeBarajeado=this.naipe.baraja();
	}
	public Juego(ArrayList<String> ids) {
		this.ids=ids;
		this.naipe=new Naipe();
		this.catasJugador=new ArrayList<>();
		this.naipeBarajeado=this.naipe.baraja();
		for(String id : ids) {
			this.catasJugador.add(new ArrayList<Carta>());
		}
	}
	public void entregarCartas(int cartasPorJugador) {
		int numJugador=this.catasJugador.size();
		int cartasARepartir=cartasPorJugador*numJugador;
		if(cartasARepartir > this.naipeBarajeado.size()) {
			cartasARepartir = this.naipeBarajeado.size();
		}
		for(int i=0; i<cartasARepartir; i++) {
			int indiceJugador= i % numJugador;
			Carta cartaRepartida=this.naipeBarajeado.get(i);
			this.catasJugador.get(indiceJugador).add(cartaRepartida);
			this.naipeBarajeado.remove(i);
		}
	}
	public int devolverTotal(int idJugador) {
		
		ArrayList<Carta> manoDelJugador=this.catasJugador.get(idJugador);
		int sumaTotal=0;
		for(Carta carta : manoDelJugador) {
			sumaTotal+=carta.getNumero().getValor();
		}
		return sumaTotal;
	}
	public String determinarGanador() {
		String idGanador=this.ids.get(0);
		int sumaGanadora=this.devolverTotal(0);
		for(int i=1; i<this.ids.size(); i++) {
			String idActual=this.ids.get(i);
			int sumaActual=this.devolverTotal(i);
			if(sumaActual>=sumaGanadora) {
				sumaGanadora=sumaActual;
				idGanador=idActual;
			}
		}
		return idGanador;
	}
	
	public ArrayList<ArrayList<Carta>> getCartaJugador(){
		return this.catasJugador;
	}

}
