package com.polimorfismo;

public class Triangulo extends Figura{
	int base;
	int altura;
	
	public Triangulo(int base, int altura, String label) {
		super(label);
		this.base=base;
		this.altura=altura;
	}
	
	public int calcularArea() {
		return (base*altura)/2;
	}
	
}
