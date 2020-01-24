package com.polimorfismo;

public class Cuadrado extends Figura {
	int lado;
	
	public Cuadrado(int lado, String label) {
		super(label);
		this.lado=lado;
	}
	
	public int calcularArea() {
		return lado*lado;
	}
}
