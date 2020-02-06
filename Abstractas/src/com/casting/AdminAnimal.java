package com.casting;

import com.herencia.Animal;
import com.herencia.Gato;
import com.herencia.Perro;

public class AdminAnimal {

	public static Animal buscar(int x) {
		if (x > 4) {
			return new Perro();
		} else {
			return new Gato();
		}
	}

}
