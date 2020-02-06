package com.strings;

public class Ejercicio1 {

	public static void main(String... x) { // varargs
		// TODO Auto-generated method stub
		// System.out.println(x[0]);
		int sumandos[] = { 4, 5, 6 };
		sumar(sumandos);
		sumar(5, 6, 8);
		sumar();
		sumar(5, 6);
	}

	public static void sumar(int... numeros) {
		int suma = 0;
		for (int numero : numeros) {
			suma += numero;
		}
	}

}
