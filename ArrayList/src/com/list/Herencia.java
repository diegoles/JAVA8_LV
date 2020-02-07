package com.list;

import java.util.ArrayList;
import java.util.List;

public class Herencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<>();
		lista.add("xxx");
		//lista.add(3); // No es un String

		// Lista de Object
		List nuevaLista = new ArrayList<>();
		nuevaLista.add(3); // analiza hacia arriba, busca int, short, ..., Integer, ..."Object"
		nuevaLista.add(new Cliente("Juan"));
		
		// Puedo poner Perros y Gatos por que son herencia de Animal.
		// Animal o hijos de Animal
		List<Animal> animales = new ArrayList<>();
		animales.add(new Animal());
		animales.add(new Gato());
		animales.add(new Perro());
		
		// Puedo agregar Gato o hijos de Gato
		List<Gato> gatos = new ArrayList<>();
		//gatos.add(new Animal());
		
		// Puedo agregar Domesticable o clases que implementen Domesticable
		List<Domesticable> domesticables = new ArrayList<>();
		domesticables.add(new Gato());
		//domesticables.add(new Domesticable());   // NO se puede instanciar de interface o abstractas
		//domesticables.add(new Perro()); // Perro no implementa Domesticable
		

	}

}
