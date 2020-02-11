package com.switchs;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "a";
		switch (x) {
		case "a":
			System.out.println("a");
		case "b":
			System.out.println("b");// Imprime "a" y "b"
		}

		String z = "a";
		switch (z) {
		case "a":
			System.out.println("a");
			break;
		case "b":
			System.out.println("b");
			break; // Imprime "a"
		}

		String y = "q";
		switch (y) {
		default:
			System.out.println("def");
		case "a":
			System.out.println("a");
			break;
		case "b":
			System.out.println("b");
			break; // Imprime "def" y "a"
		}

		String h = "q";
		switch (h) {
		default:
		case "a":
			System.out.println("a");
			break;
		case "b":
			System.out.println("b");
			break; // Imprime "def" y "a"
		}
	}

}
