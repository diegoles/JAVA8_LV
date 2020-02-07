package com.list;

import java.util.ArrayList;

public class Metodos2 {

	public static void main(String[] args) {
		ArrayList<Integer> cadenas = new ArrayList<>();
		cadenas.add(1);
		cadenas.add(2);
		cadenas.add(null);
		cadenas.add(3);
		System.out.println(cadenas); // [1, 2, null, 3], => sobreescrito el toInteger

		//cadenas.remove(4); //java.lang.IndexOutOfBoundsException, no hay la posicion.
		cadenas.remove(1);
		System.out.println(cadenas); // [1, null, 3]

		// utiliza equal para comparar de uno en uno, y le encuentra por que esta sobreescrito en Integer
		cadenas.remove(new Integer(1));  // Remueve el objeto 1, no la posicion
		System.out.println(cadenas); // [null, 3]

		cadenas.remove(new Integer(6));
		System.out.println(cadenas);

	}

}
