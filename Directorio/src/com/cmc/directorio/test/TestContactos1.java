package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("claro","0936251478",597);
		Telefono telf2=new Telefono("movi","0923564125",236);
		Contacto c1=new Contacto("Fer","Pineda",telf1,100.25);
		Contacto c2=new Contacto("Fari","Vermeo",telf2,64.25);
		
		AdminContacto adm=new AdminContacto();
		Contacto masPesado= adm.buscarMasPeso(c1, c2);
		System.out.println("Mas Pesado: "+masPesado.getNombre()+" "+masPesado.getApellido()+": "+masPesado.getPeso());
		
		adm.compararOperadoras(c1, c2);
		boolean sonIguales= adm.compararOperadoras(c1, c2);
		System.out.println("¿Pertenecen a la misma operadora?: "+sonIguales);
		

	}

}
