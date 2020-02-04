package com.sobrecarga;

public class DataType {

	public static void main(String[] args) {
		int x = 10;
		m1(x);
		Integer y = 10;
		m1(y);

		byte b = 10;
		m1(b); // busca el siguiente primitivo mas grande mas grande, de no existir el exacto
	}

	public static void m1(int x) {
		System.out.println("int");
	}

	public static void m1(Integer x) {
		System.out.println("Integer");
	}

	public static void m1(long x) {
		System.out.println("long");
	}

	public static void m1(short x) {
		System.out.println("short");
	}
}
