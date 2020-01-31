package com.tipos;

public class Tipos {

	public static void main(String[] args) {
		// El tamanio si importa
		int x=10;
		//byte b=x; // Error de compilacion, no se puede asignar algo mas grade en algo mas pequeño
		
		float f=x;   // Lo flotantes y doubles son mas grandes que los enteros
		//float f1 = 10.0; //double es mas grande que un float, error compilacion
		float f2=10.0f;  // 10.0f o 10.0F es un float  (d,D, L)
		float f3=10.0F;
		
		float f4 = (float) 10.0;
		
		int valor = 470000;
		short s = (short) valor; // Cambia valor a 11248 le trunca , cuidado con el cast. Pero si compila.
		// int=32 y shot =16, es mas pequenio asi le haga un casting. (Depende el numero y la longitud)
		// 0000 0000 1111 1111 =470000         1111 1111 = 11248
		
		System.out.println(s);
		int a = 1;
		short s1=(short)a;
		System.out.println(s1);
		
		
		
		
	}

}
