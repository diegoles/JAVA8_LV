package com.sobrecarga;

public class DataType3 {

	public static void main(String[] args) {
		int x = 10;
		m1(x);
		Integer y = 10;
		m1(y);
		byte b = 10;
		m1(b); // busca el siguiente primitivo mas grande mas grande, de no existir el exacto
	}

	public static void m1(float x) {  // compara el primitivo exacto,como no exite ve le siguiente primitivo mas grande
		System.out.println("float");
	}

	public static void m1(Integer x) {
		System.out.println("Integer");
	}

	public static void m1(Long x) {
		System.out.println("Long");
	}

	public static void m1(short x) {
		System.out.println("short");
	}
}
