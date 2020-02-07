package com.list;

import java.util.ArrayList;

public class Metodos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Edgar1"));
		personas.add(new Persona("Edgar2"));
		personas.add(new Persona(null));
		personas.add(new Persona("Edgar3"));
		// NO esta sobreescrito el toString en Persona
		System.out.println(personas); //[com.list.Persona@15db9742, com.list.Persona@6d06d69c, com.list.Persona@7852e922, com.list.Persona@4e25154f]
		// SObreescribiendo el toString en Persona
		System.out.println(personas); //[com.list.Persona@15db9742, com.list.Persona@6d06d69c, com.list.Persona@7852e922, com.list.Persona@4e25154f]
		
		personas.remove(1);
		System.out.println(personas); // [Persona [nombre=Edgar], Persona [nombre=Edgar2], Persona [nombre=null], Persona [nombre=Edgar3]]

		// utiliza equal para comparar de uno en uno, y NO le encuentra por que esta sobreescrito en Persona
		personas.remove(new Persona("Edgar1"));  // NO Remueve el objeto 1
		System.out.println(personas); // [Persona [nombre=Edgar], Persona [nombre=null], Persona [nombre=Edgar3]]

		personas.remove(new Persona("Edgar6"));
		System.out.println(personas); //[Persona [nombre=Edgar], Persona [nombre=null], Persona [nombre=Edgar3]]
		
		
		
		
	}

}
