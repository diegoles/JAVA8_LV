package com.sobrecarga;

public class DataType2 {

	public static void main(String[] args) {
		int x = 10;  // no hay primitivos mayores, se conviente el Wrapper si existe, si no existe el Wrapper es error de ejecucion
		m1(x);
		Integer y = 10;
		m1(y);
		byte b = 10;
		m1(b); // busca el siguiente primitivo mas grande mas grande, de no existir el exacto
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
