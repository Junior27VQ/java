package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("movi","0914523698",258);
		Telefono telf2=new Telefono("movi","0963265482",159);
		Contacto c1=new Contacto("Karlos","Echeveria",telf1,125.25);
		Contacto c2=new Contacto("Rodo","Venom",telf2,245.15);
		
		AdminContacto adm=new AdminContacto();
		Contacto masPesado= adm.buscarMasPeso(c1, c2);
		System.out.println("Mas Pesado: "+masPesado.getNombre()+" "+masPesado.getApellido()+": "+masPesado.getPeso());
		
		adm.compararOperadoras(c1, c2);
		boolean sonIguales= adm.compararOperadoras(c1, c2);
		System.out.println("¿Pertenecen a la misma operadora?: "+sonIguales);
		


	}

}
