package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
        //1. Declaro una variable llamada p de tipo Persona
		Persona p1; 
        Persona p2=new Persona();
        //2. Instaciar un objeto Persona y referenciarlo con p
        p1=new Persona();
        //3. Modificar los atributos
        p1.nombre ="Juan";
        p1.edad = 25;
        p1.estatura = 1.25;
      //4. Accedo a los atributos
        System.out.println("hola mundo");
        System.out.println("nombre:"+p1.nombre);
        System.out.println("edad:"+p1.edad);
        System.out.println("estatura:"+p1.estatura);
      //3.2. Modificar los atributos
        p2.nombre ="Andrea";
        p2.edad = 45;
        p2.estatura = 1.65;
      //4.2. Accedo a los atributos
        System.out.println("hola mundo");
        System.out.println("nombre:"+p2.nombre);
        System.out.println("edad:"+p2.edad);
        System.out.println("estatura:"+p2.estatura);
        }

}
