package com.bidimensionales;

public class Iteracion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arreglo[][] = { { 3, 4 }, { 5, 6, 7 }, { 1 } };

		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[i].length; j++) {
				System.out.println(arreglo[i][j]);
			}
		}

		for (int[] celda : arreglo) {
			for (int valor : celda) {
				System.out.println(valor);
			}
		}

		for (int i = 0; i < arreglo.length; i++) {
			for (int valor : arreglo[i]) {
				System.out.println(valor);
			}
		}

		for (int[] celda : arreglo) {
			for (int j = 0; j < celda.length; j++) {
				System.out.println(celda[j]);
			}
		}

	}

}
