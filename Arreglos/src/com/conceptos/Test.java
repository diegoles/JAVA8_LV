package com.conceptos;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int datos[]=new int[5];
		guardar(datos);
		System.out.println(datos[0]); // 10
		// un array es un Objeto, por tanto no contiene el array como tal, sino una referencia al mismo.
		
	}

	public static void guardar(int [] valores) {
		valores[0]=10;
	}
}
