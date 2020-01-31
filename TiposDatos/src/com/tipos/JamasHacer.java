package com.tipos;

public class JamasHacer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = 100; // Hasta el 127 sale true
		Integer i2 = 100;

		boolean b = i1 == i2; // true;  lo que pasa es que estan apuntado al mismo objeto por que reutiliza
		System.out.println(b);

		Integer j1 = 600;
		Integer j2 = 600;

		boolean c = j1 == j2; // false;
		System.out.println(c);

		String p = "a";
		String x = "abc";
		String y = "abc";
		String z = p + "bc";
		boolean r1 = x == y;
		System.out.println(r1); // String es inmutable.  lo que pasa es que estan apuntado al mismo objeto por que reutiliza
		boolean r2 = z == y;
		System.out.println(r2); //flase
	}

}
