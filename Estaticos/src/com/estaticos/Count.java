package com.estaticos;

public class Count {
	int valor; // cada objeto
	static int valorEstatico; // CLase
	
	public void add() {
		valorEstatico++;
		valor++;
		this.valorEstatico++;  // Count.valorEstatico
		this.valor++;
	}
	
	public static void agregar() {
		valorEstatico++;
		//valor++;  // NO se puede acceder a atributos no estaticos
		Count c = new Count();
		c.valor++;
	}
}
