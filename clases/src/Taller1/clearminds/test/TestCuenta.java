package Taller1.clearminds.test;

import Taller1.clearminds.cuestas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1=new Cuenta("03476");
		cuenta1.setSaldo(675);
		Cuenta cuenta2=new Cuenta("03476","C",98);
		Cuenta cuenta3=new Cuenta("03476");
		cuenta3.setTipo("C");
		Cuenta cuenta4=new Cuenta("0987");
		Cuenta cuenta5=new Cuenta("0557","C",10);
		Cuenta cuenta6=new Cuenta("0666");
		
		String tipoModificado;
		double saldoModificado;
		
		System.out.println("-----Valores iniciales------");
		cuenta1.imprimiConMiEstilo();
		cuenta2.imprimiConMiEstilo();
		cuenta3.imprimiConMiEstilo();
		
		System.out.println("-----Valores modificado------");
		saldoModificado=cuenta1.setSaldo(444);
		saldoModificado=cuenta3.setSaldo(567);
		tipoModificado=cuenta2.setTipo("D");
		cuenta1.imprimiConMiEstilo();
		cuenta2.imprimiConMiEstilo();
		cuenta3.imprimiConMiEstilo();
		
		saldoModificado=cuenta4.setSaldo(10);
		
		System.out.println("-----Cuenta4------");
		cuenta4.imprimiConMiEstilo();
		System.out.println("-----Cuenta5------");
		cuenta5.imprimiConMiEstilo();
		System.out.println("-----Cuenta6------");
		cuenta6.imprimiConMiEstilo();
	}

}
