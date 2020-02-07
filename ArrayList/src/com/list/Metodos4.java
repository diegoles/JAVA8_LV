package com.list;

import java.util.ArrayList;

public class Metodos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Persona p1 = new Persona("Edgar1");
		personas.add(p1);
		personas.add(new Persona("Edgar2"));
		personas.add(new Persona(null));
		personas.add(new Persona("Edgar3"));
		// NO esta sobreescrito el toString en Persona
		System.out.println(personas);//[Persona [nombre=Edgar1], Persona [nombre=Edgar2], Persona [nombre=null], Persona [nombre=Edgar3]]
		
		// Remueve por que apuntan al mismo objeto
		personas.remove(p1);
		System.out.println(personas); //[Persona [nombre=Edgar2], Persona [nombre=null], Persona [nombre=Edgar3]]
	}

}
