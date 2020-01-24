package com.casting;

import com.herencia.Animal;
import com.herencia.Perro;

public class TestCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		// PERRO = ANIMAL
		// HIJO = PADRE   => ERROR COMPILACION
		//Perro p = a;
		
				   // (PERRO) ANIMAL, EN COMPILACION OK "PADRE=HIJO E HIJO=PADRE"
		Perro p = (Perro) a;
		
					//(Perro)Animal  	EN EJECUCION FALLA, POR QUE SOLO FUNCIONA PADRE=HIJO
		
	}

}
