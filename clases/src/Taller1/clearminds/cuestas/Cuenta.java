package Taller1.clearminds.cuestas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;
	
	public Cuenta(String id) {
		this.id=id;
		tipo="A";
	}
	public Cuenta(String id, String tipo, double saldo) {
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;
	}
	
	
	public String getId() {
		return id;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public String setTipo(String tipo) {
		return this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public double setSaldo(double saldo) {
		return this.saldo = saldo;
	}
	public void imprimiConMiEstilo() {
		System.out.println("************");
		System.out.println("CUENTA");
		System.out.println("************");
		System.out.println("Numero de Cueta: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: USD "+saldo);
		System.out.println("************");
	}

}
