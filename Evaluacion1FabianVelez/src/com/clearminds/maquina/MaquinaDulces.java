package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celda;
	private double saldo;
	
	public MaquinaDulces(){
		celda=new ArrayList<Celda>();
	}
	public void agregarCelda(Celda codigo) {
		celda.add(codigo);
	}
	public void mostrarConfiguracion() {
		Celda c;
		for(int i=0;i<celda.size();i++) {
			c=celda.get(i);
			System.out.println("CELDA: "+c.getCodigo());
			
		}
	}
	public Celda buscarCelda(String codigo) {
		Celda celdaEncontrada=null;
		Celda cel;
		for(int i=0;i<celda.size();i++) {
			cel=celda.get(i);
			if(codigo.equals(cel.getCodigo())) {
				celdaEncontrada=cel;
			}
		}
		return celdaEncontrada;
	}
	public void cargarProducto(Producto producto, String codigo,int cantidad) {
		Celda celdaRecuperada;
		celdaRecuperada=buscarCelda(codigo);
		
		if(celdaRecuperada!=null) {
			celdaRecuperada.ingresarProducto(producto, cantidad);
		}else {
			System.out.println("La celda no existe");
		}
	}
	public void mostrarProductos() {
		Celda cel;
		for(int i=0;i<celda.size();i++) {
			cel=celda.get(i);
			if(cel.getProducto()!=null) {
			System.out.println("Celda: "+cel.getCodigo()+" Stock: "+cel.getStock()+" Producto: "+cel.getProducto().getCodigo()+" Precio: "+cel.getProducto().getPrecio());
			}else {
				System.out.println("Celda: "+cel.getCodigo()+" Stock: "+cel.getStock()+" Sin Producto asignado");
			}
		}
		System.out.println("Saldo: "+saldo);
	}
	public Producto buscarProductoEnCelda(String codigo) {
		Producto producto=null;
		Celda c=buscarCelda(codigo);
		if(c!=null) {
			producto=c.getProducto();
		}
		return producto;
	}
	public double consultarPrecio(String codigo) {
		Celda cel=buscarCelda(codigo);
		double precio=0;
		if(cel!=null) {
			precio=cel.getProducto().getPrecio();
		}
		return precio;
	}
	public Celda buscarCeldaProducto(String cp) {
		for(Celda celda:this.celda) {
			Producto p=celda.getProducto();
			if(p!=null && p.getCodigo().equalsIgnoreCase(cp)) {
				return celda;
			}
		}return null;
	}
	public void incrementarProductos(String cp, int cantidad) {
		Celda celdaEncontrada;
		celdaEncontrada=buscarCeldaProducto(cp);
		if(celdaEncontrada!=null) {
			int stockActual=celdaEncontrada.getStock();
			celdaEncontrada.setStock(stockActual+cantidad);
			
		}
	}
	public void vender(String codigo) {
		Celda vendida;
		vendida=buscarCelda(codigo);
		    if(vendida!=null) {
			    int stock=vendida.getStock();
			    vendida.setStock(stock-1);
			    double precio=0;
			    precio=vendida.getProducto().getPrecio();
			    this.saldo+=precio;
		}
	}
	public double venderConCambio(String codigo,double valor) {
		double cambio=0;
		Celda cel=buscarCelda(codigo);
		if(cel!=null) {
			double precio=cel.getProducto().getPrecio();
			cambio=valor-precio;
			int stock=cel.getStock();
			cel.setStock(stock-1);
			this.saldo=precio;
		}
		return cambio;
	}
	public ArrayList<Producto> buscarMenor(double limite) {
		ArrayList<Producto> menores=new ArrayList<>();
		for(Celda celda: this.celda) {
			Producto producto=celda.getProducto();
			if(producto!=null) {
				double precio=producto.getPrecio();
				if(precio<limite) {
					menores.add(producto);
				}
			}
		}
		return menores;
	}
	
	public ArrayList<Celda> getCelda() {
		return celda;
	}
	public void setCelda(ArrayList<Celda> celda) {
		this.celda = celda;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
