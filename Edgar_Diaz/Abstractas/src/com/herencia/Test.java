package com.herencia;

public class Test {
	public static void main(String[] args) {
		
		// COMPILACION ==> TIPO DATO
		// EJECUCION ==> APUNTADORES
		Gato g = new Gato();
		g.comer(); //Animal
		g.maullar(); // Gato
		g.toString(); // Object
		g.hashCode(); // Object
		
		// ANIMAL = GATO	PADRE=HIJO
		Animal a = new Gato();
		// Gato g1 = new Animal();
		a.comer();
		//a.maullar();  // Gato
		a.toString();
		
		//PADRE =HIJO
		Object obj = new  Gato();
		//obj.comer();
		//obj.maullar();
		obj.toString();
	}
	
}
