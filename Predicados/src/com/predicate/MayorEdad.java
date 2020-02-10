package com.predicate;

import java.util.function.Predicate;

public class MayorEdad implements Predicate<Persona> {
	public boolean test(Persona p) {
		return p.getEdad() > 18;
	}
}
