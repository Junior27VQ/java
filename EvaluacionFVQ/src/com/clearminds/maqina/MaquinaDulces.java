package com.clearminds.maqina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {
		this.celda1=new Celda(cod1);
		this.celda2=new Celda(cod2);
		this.celda3=new Celda(cod3);
		this.celda4=new Celda(cod4);
	}
	public void mostrarConfiguracion() {
		System.out.println("----------Codigos:----------- ");
		System.out.println("Celda1: "+celda1.getCodigo());
		System.out.println("Celda2: "+celda2.getCodigo());
		System.out.println("Celda3: "+celda3.getCodigo());
		System.out.println("Celda4: "+celda4.getCodigo());
		System.out.println("******************************");
	}
	public Celda buscarCelda(String cod) {
		if(cod==celda1.getCodigo()) {
			return celda1;
		}else if(cod==celda2.getCodigo()) {
			return celda2;
		}else if(cod==celda3.getCodigo()) {
			return celda3;
		}else if(cod==celda4.getCodigo()) {
			return celda4;
		}else {
		return null;
		}
		
	}//Este codigo lo cree yo
	public void cargarProducto(Producto producto, String cod, int item) {
		Celda celdaRecuperada=buscarCelda(cod);
		if(celdaRecuperada!=null) {
			celdaRecuperada.ingrsarProducto(producto, item);
		}else {
			System.out.println("Error: Celda con codigo "+cod+" no encontrada.");
		}
	}
	public void mostrarProducto() {
		
		if(celda1.getProducto()!=null) {
			System.out.println("*******************"+celda1.getCodigo());
		    System.out.println(" Stock "+celda1.getStock());
		    System.out.println(" Nombre Producto: "+celda1.getProducto().getNombre());
		    System.out.println(" Precio Producto: "+celda1.getProducto().getPrecio());
		    System.out.println(" Codigo Producto: "+celda1.getProducto().getCodigo());
	    }else {
	    	System.out.println("*******************"+celda1.getCodigo());
		    System.out.println(" Stock "+celda1.getStock());
		    System.out.println(" La celda no tiene producto!!!");
	    }
		if(celda2.getProducto()!=null) {
			System.out.println("*******************"+celda2.getCodigo());
		    System.out.println(" Stock "+celda2.getStock());
		    System.out.println(" Nombre Producto: "+celda2.getProducto().getNombre());
		    System.out.println(" Precio Producto: "+celda2.getProducto().getPrecio());
		    System.out.println(" Codigo Producto: "+celda2.getProducto().getCodigo());
	    }else {
	    	System.out.println("*******************"+celda2.getCodigo());
		    System.out.println(" Stock "+celda2.getStock());
		    System.out.println(" La celda no tiene producto!!!");
	    }
		if(celda3.getProducto()!=null) {
			System.out.println("*******************"+celda3.getCodigo());
		    System.out.println(" Stock "+celda3.getStock());
		    System.out.println(" Nombre Producto: "+celda3.getProducto().getNombre());
		    System.out.println(" Precio Producto: "+celda3.getProducto().getPrecio());
		    System.out.println(" Codigo Producto: "+celda3.getProducto().getCodigo());
	    }else {
	    	System.out.println("*******************"+celda3.getCodigo());
		    System.out.println(" Stock "+celda3.getStock());
		    System.out.println(" La celda no tiene producto!!!");
	    }
		if(celda4.getProducto()!=null) {
			System.out.println("*******************"+celda4.getCodigo());
		    System.out.println(" Stock "+celda4.getStock());
		    System.out.println(" Nombre Producto: "+celda4.getProducto().getNombre());
		    System.out.println(" Precio Producto: "+celda4.getProducto().getPrecio());
		    System.out.println(" Codigo Producto: "+celda4.getProducto().getCodigo());
	    }else {
	    	System.out.println("*******************"+celda4.getCodigo());
		    System.out.println(" Stock "+celda4.getStock());
		    System.out.println(" La celda no tiene producto!!!");
	    }
		System.out.println("Sald0: "+saldo);
	}
	public Producto buscarProductoEnCelda(String codigo) {
		Celda celda=buscarCelda(codigo);
		if(celda!=null && celda.getProducto()!=null) {
			return celda.getProducto();
		}
		return null;
	}
	public double consultarPrecio(String cod) {
		Producto producto=buscarProductoEnCelda(cod);
		if(producto!=null) {
			return producto.getPrecio();
		}
		return 0.0;
	}
	public Celda buscarCeldaProducto(String cp) {
		Producto p1=celda1.getProducto();
		Producto p2=celda2.getProducto();
		Producto p3=celda3.getProducto();
		Producto p4=celda4.getProducto();
		if(p1!=null && p1.getCodigo().equalsIgnoreCase(cp)) {
			return celda1;
		}else if(p2!=null && p2.getCodigo().equalsIgnoreCase(cp)) {
			return celda2;
		}else if(p3!=null && p3.getCodigo().equalsIgnoreCase(cp)) {
			return celda3;
		}else if(p4!=null && p4.getCodigo().equalsIgnoreCase(cp)) {
			return celda4;
		}
		return null;
	}
	public void incrementarProductos(String cod, int cantidad) {
		Celda celdaEncontrada=buscarCeldaProducto(cod);
		if(celdaEncontrada!=null) {
			int stockActual=celdaEncontrada.getStock();
			celdaEncontrada.setStock(cantidad+stockActual);
		}else {
			System.out.println("No se encontro ningina celda con el codigo: "+cod);
		}
	}
	public void vender(String codigo) {
		Celda celda = buscarCelda(codigo);
		if(celda!=null && celda.getStock()>0) {
			celda.setStock(celda.getStock()-1);
			double precioProducto=celda.getProducto().getPrecio();
			this.saldo+=precioProducto;
			mostrarProducto();
		}
	}
	public double venderConCambio(String cod, double valor) {
		Celda celda=buscarCelda(cod);
		if(celda!=null && celda.getProducto()==null || celda.getStock()==0) {
			return valor;//se devuelbe todo el dinero si no se puede vender
		}else {
		double precio=celda.getProducto().getPrecio();
		celda.setStock(celda.getStock()-1);
		this.saldo+=precio;
		
		double cambio=valor-precio;
		return cambio;
		}
	}
	
	public Celda getCelda1() {
		return celda1;
	}
	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}
	public Celda getCelda2() {
		return celda2;
	}
	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}
	public Celda getCelda3() {
		return celda3;
	}
	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}
	public Celda getCelda4() {
		return celda4;
	}
	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
