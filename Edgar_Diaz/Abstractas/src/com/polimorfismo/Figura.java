package com.polimorfismo;

public abstract class Figura {
	private String label;
	
	public Figura(String label) {
		this.label=label;
	}

	public String getLabel() {
		return label;
	}
	
	/*
	public int calcularArea() {
		return 0;
	}*/
	
	public abstract int calcularArea();
}
