package com.sobrecarga;

public class DataType4 {

	public static void main(String[] args) {
		int x = 10;
		m1(x);
	}

	// Puede ir por Intger o cualquier padre, en este caso por Number u Object, desde el mas proximo.
	public static void m1(Number x) {
		System.out.println("Number");
	}

	public static void m1(Object x) {
		System.out.println("Object");
	}
}
