package com.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Buscador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> personas = Arrays.asList(
				new Persona(10, "Edgar"), 
				new Persona(20, "Juan"),
				new Persona(30, "Luis")
				);

		Persona res = buscar(personas, new MayorEdad());
		System.out.println(res);

		Persona res1 = buscar(personas, new Predicate<Persona>() { // new de una clase anonima que implementa la interface
			@Override
			public boolean test(Persona t) {
				// TODO Auto-generated method stub
				// return false;
				return t.getEdad() > 18;
			}
		});

		System.out.println(res1);
		
		
		// Predicate con lamdas
		Persona res2 = buscar(personas, (Persona p) -> {
			return p.getEdad() > 18;
		});
		System.out.println(res2);

		Persona res3 = buscar(personas, (Persona p) -> p.getEdad() > 18);
		System.out.println(res3);
		
		Persona res4 = buscar(personas, p -> p.getEdad() > 18);
		System.out.println(res4);
		
		System.out.println(personas);
		//personas.removeIf(x -> x.getNombre().equalsIgnoreCase("luis"));  // java.lang.UnsupportedOperationException por que es un arrayList
		System.out.println(personas);
		
		List<Persona> people = new ArrayList<>();
		people.add(new Persona(10, "Pepe") );
		people.add(new Persona(20, "Lucho"));
		people.add(new Persona(30, "Juancho"));
		System.out.println(people);
		people.removeIf(x -> x.getNombre().equalsIgnoreCase("lucho"));
		System.out.println(people); // ArrayList tiene sobreescrito el toString, como esta sobreescrito imprime en el formato
		
		
		//List lista; //List<Object> lista;
		//lista.add(10);
		//lista.add(new Persona(25, "ED"));
		//List<Lavable> x; // Lavable es interface
		//x.add(new Lavable()); // no se puede instanciar
		//x.add(new Dinero()); //Dinero implementa Lavable
		

	}

	public static Persona buscar(List<Persona> personas, Predicate<Persona> p) {
		for (Persona persona : personas) {
			if (p.test(persona)) {
				return persona;
			}
		}
		return null;
	}

}
