package com.list;

import java.util.ArrayList;

public class Metodos {

	public static void main(String[] args) {
		ArrayList<String> cadenas = new ArrayList<>();
		cadenas.add("uno");
		cadenas.add("dos");
		cadenas.add(null);
		cadenas.add("tres");
		System.out.println(cadenas); // [uno, dos, null, tres], => sobreescrito el toString

		// cadenas.remove(4); //java.lang.IndexOutOfBoundsException, no hay la posicion.
		cadenas.remove(1);
		System.out.println(cadenas); // [uno, null, tres]

		// utiliza equal para comparar de uno en uno, y le encuentra por que esta sobreescrito en String
		cadenas.remove("uno"); 
		System.out.println(cadenas); // [null, tres]

		cadenas.remove("x");
		System.out.println(cadenas);

	}

}
