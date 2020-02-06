package com.conceptos;

public class Iteracion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arreglo[] = { 4, 5, 6, 7 };

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}

		for (int val : arreglo) {
			System.out.println(val);
		}

		int values[] = new int[4];
		values[0] = 3;
		values[1] = values[0]++;
		values[2] = values[1]++;
		for (int i : values) {
			System.out.println("val :" + values[i]);
		}

	}

}
