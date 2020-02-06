package com.conceptos;

public class Indice {
	public static void main(String[] args) {
		int x[]=new int[4];
		x[3]=10;
		//x[4]=8;			// no da error de compilacion
		x[20]=5;		// no da error de compilacion
		
		// ****Error de ejecucion***		java.lang.ArrayIndexOutOfBoundsException: 20
		
	}
}
