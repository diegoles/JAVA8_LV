package com.casting;

import com.herencia.Animal;
import com.herencia.Perro;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = AdminAnimal.buscar(6);
		//a.ladrar();
		
		// PERRO = ANIMAL
		// HIJO=PADRE
		//Perro p = AdminAnimal.buscar(6);
		//p.ladrar();
		
					//COMPILACION
					//(PERRO)ANIMAL OK, BASTA QUE ESTEN EN RELACION DE HERENCIA
					//(ANIMAL)PERRO OK, BASTA QUE ESTEN EN RELACION DE HERENCIA
		Perro p2 = (Perro) AdminAnimal.buscar(1);
		p2.ladrar();
		
		// COMPILACION PARA CAST PADRE=HIJO E HIJO=PADRE
		// EJECUCION PARA CAST SI Y SOLO SI PADRE=HIJO
	}

}
