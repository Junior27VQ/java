package com.krakedev.test;

import com.krakedev.Persona;

public class TestPersona {

	public static void main(String[] args) {
        //1. Declaro una variable llamada p de tipo Persona
		Persona p1; 
        Persona p2=new Persona();
        //2. Instaciar un objeto Persona y referenciarlo con p
        p1=new Persona();
        Persona p3=new Persona("Jose");
        Persona p4=new Persona("Fransisco",34,1.58);
        
        System.out.println("hola mundo"+p3.getNombre());
        System.out.println("nombre:"+p4.getNombre());
        System.out.println("edad:"+p4.getEdad());
        System.out.println("estatura:"+p4.getEstatura());
        //3. Modificar los atributos
        p1.setNombre("Juan");
        p1.setEdad(25);
        p1.setEstatura(1.25);
      //4. Accedo a los atributos
        System.out.println("hola mundo");
        System.out.println("nombre:"+p1.getNombre());
        System.out.println("edad:"+p1.getEdad());
        System.out.println("estatura:"+p1.getEstatura());
      //3.2. Modificar los atributos
        p2.setNombre("Andrea");
        p2.setEdad(45);
        p2.setEstatura(1.65);
      //4.2. Accedo a los atributos
        System.out.println("hola mundo");
        System.out.println("nombre:"+p2.getNombre());
        System.out.println("edad:"+p2.getEdad());
        System.out.println("estatura:"+p2.getEstatura());
        }

}
