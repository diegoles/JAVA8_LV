package com.list;

import java.util.Arrays;
import java.util.List;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animales[] = new Animal[2];
		List<Animal> lista = Arrays.asList(animales);

		// public static List <T> Arrays.asList(T... animales); //varargs

		List<Animal> lista1 = Arrays.asList(new Animal(), new Animal(), new Animal());

	}

}
