package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;


public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("H1"));
        maquina.agregarCelda(new Celda("Q2"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("L2"));
        maquina.agregarCelda(new Celda("M1"));
        maquina.agregarCelda(new Celda("S2"));
		
        Producto producto1=new Producto("Doritos",0.95, "GE36");
		maquina.cargarProducto(producto1, "H1", 2);
		Producto producto2=new Producto("Chettos",1.95, "KO78");
		maquina.cargarProducto(producto2, "Q2", 10);
		Producto producto3=new Producto("Bolitas de queso",7.95, "LK25");
		maquina.cargarProducto(producto3, "B1", 1);
		Producto producto4=new Producto("Plopo",0.25, "GÑ96");
		maquina.cargarProducto(producto4, "L2", 50);
		Producto producto5=new Producto("Dedos",1.05, "KM18");
		maquina.cargarProducto(producto5, "M1", 4);
		Producto producto6=new Producto("Cuerito",0.35, "MJ25");
		maquina.cargarProducto(producto6, "S2", 5);
		
		double limite=4;
		ArrayList<Producto> buscar=maquina.buscarMenor(limite);
		System.out.println("PRODUCTOS MENORES: "+buscar.size());
		for(Producto p: buscar) {
			System.out.println("Nombre: "+p.getNombre()+" Precio: "+p.getPrecio());
		}
		

	}

}
