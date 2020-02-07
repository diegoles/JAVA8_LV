package com.list;

public class Persona {

	private String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public Persona() {
		// Persona("XXXXX"); // CALAMBRE AL OJO
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("compara con persona" + this.nombre);
		return this == obj;
	}

}
