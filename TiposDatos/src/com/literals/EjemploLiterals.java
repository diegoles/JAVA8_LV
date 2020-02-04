package com.literals;

public class EjemploLiterals {

	public static void main(String[] args) {
		int x = 3100;
		System.out.println(x);
		int y = 3_100;			// Siempre y cuando este entre 2 numeros.
		System.out.println(y);
		
		//int x1=_3100;  // no funciona, error compilacion
		//float f = 566_.45; // no funciona, error compilacion
		//float f1 = 566.45_f; // no funciona, error compilacion
	}

}
