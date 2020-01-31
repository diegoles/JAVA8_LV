package com.tipos;

public class Defecto {
	byte by;
	short s;
	int x;
	float f;
	boolean bol;
	char c;

	public static void main(String[] args) {
		// System.out.println(x); no es x estatico

		Defecto def = new Defecto();
		System.out.println(def.by);
		System.out.println(def.s);
		System.out.println(def.x);

		System.out.println(def.f);
		System.out.println(def.bol);
		System.out.println(def.c);

		System.out.println("****" + def.c + "***"); //Espacio en blanco

	}

}
