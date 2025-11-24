package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maqina.MaquinaDulces;

public class TestBuscarProductoNull {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto prod=maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:"+prod.getNombre());
		/*en la linea 16 se genra un NullPointerException en la variable prod.getNombre
		debido a que la variable esta en null y no tiene un valor lla que el vaolor esta en la B1*/

	}

}
