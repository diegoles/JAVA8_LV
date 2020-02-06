package com.ternario;

public class EjemploTernario {
	public static void main(String[] args) {
		int x = 0;
		int val;
		/*if (x > 10) {
			val = 1;
		} else {
			val = 2;
		}*/
		val = (x > 10) ? 1 : 2;
		System.out.println("val: " + val);

		int edad = 10;
		String tipo;

		tipo = (edad > 50) ? "Adulto mayor" : ((edad < 18) ? "Menor de edad" : "Adulto");

		System.out.println("tipo: " + tipo);
	}
}
