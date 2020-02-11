package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Buscador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> personas = Arrays.asList(new Persona(10, "Edgar"), new Persona(20, "Juan"),
				new Persona(30, "Luis"));

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
