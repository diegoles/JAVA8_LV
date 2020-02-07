package com.ambito;

public class Ejercicio1 {

	int a;// atributo
	private int z;

	public void metodo1() {
		int b; // variable local
		// private int q;//Error de compilacion, jamas se pone un modificador de acceso
		System.out.println(a); // a = 0;
		// System.out.println(b); // no esta inicilizado, es undefined, error de
		// compilacion
	}

	public void metodo2() {
		int c;
		c = 10;
		System.out.println(c);
	}

	public void metodo3() {
		int d;
		int x = 0;
		if (x == 0) {
			// d=5; // error de compilacion, por que no se sabe si podria ingresar o no a
			// inicilizarse.
		}
		// System.out.println(d);
	}

	public void metodo4() {
		int d;
		int x = 0;
		if (x == 0) {
			d = 5;
		} else {
			d = 6;
		}
		// SI compila por que por cualquiera de los 2 caminos se inicializa.
		System.out.println(d);
	}

	
	public void metodo5() {
		int d;
		try {
			d = 5;
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		// No compila por que podría fallar y no inicializarse
		//System.out.println(d);
	}
	public static void main(String... args) {
		Ejercicio1 e = new Ejercicio1();
		e.metodo1();
		e.metodo2();
		e.metodo3();
		e.metodo4();
		e.metodo5();

	}
}
