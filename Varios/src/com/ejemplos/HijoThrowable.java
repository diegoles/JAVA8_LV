package com.ejemplos;

public class HijoThrowable extends Throwable {

	private String atributo;

	public void atributo() {

	}

	public static void metodoEstatico() {

	}

	// Sobrecarga metodos estaticos
	public static void metodoEstatico(int x) {

		char c = 'x';
		switch (c) { // debe ser un valor unico y fijo.
		case 'a':

			break;
		case 'a': // Duplicate case, no se puede repetir, debe ser un valor unico y fijo.

			break;

		default:
			break;
		}

	}

}
