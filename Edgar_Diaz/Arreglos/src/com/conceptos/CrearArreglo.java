package com.conceptos;

public class CrearArreglo {

	public static void main(String[] args) {
		int[] arreglo1;
		int arreglo2[];
		// int arreglo2 [5]; //NO se debe colocar el tamanio en la declaracion

		arreglo1 = new int[3]; // SI define el tamanio es fijo, no se puede cambiar
		// arreglo1 = new int[]; // No compila es obligatorio poner el tamanio
		arreglo1[0] = 1;

		for (int i = 0; i < arreglo1.length; i++) {
			System.out.println(arreglo1[i]);
		}

		String arreglo4[] = new String[3];
		for (int i = 0; i < arreglo4.length; i++) {
			System.out.println(arreglo4[i]);
		}

		int arreglo5[] = { 6, 7, 8 };
		for (int i = 0; i < arreglo5.length; i++) {
			System.out.println(arreglo5[i]);
		}
		
		int arreglo7 []= {4,2,3};
		int arreglo8 []= new int[1];
		arreglo8=arreglo7;
		
		for (int i = 0; i < arreglo8.length; i++) {
			System.out.println(arreglo8[i]);
		}
	}
}
