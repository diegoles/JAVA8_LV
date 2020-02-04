package com.sobrecarga;

public class DataType5 {

	public static void main(String[] args) {
		int x = 10;  
		//m1(x); // se conviente el Wrapper si existe, si no existe el Wrapper es error de compilacion
		byte b = 10;
		m1(b); // busca el siguiente primitivo mas grande mas grande, de no existir el exacto
	}

	public static void m1(Long x) {
		System.out.println("Long");
	}

	public static void m1(short x) {
		System.out.println("short");
	}
}
