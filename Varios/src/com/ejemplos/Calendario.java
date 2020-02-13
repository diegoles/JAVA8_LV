package com.ejemplos;

// Calendar c = Calensar.getIntance();
public class Calendario {

	private static Calendario instancia;

	private Calendario() {

	}

	public static Calendario getIntance() {
		if (instancia == null) {
			instancia = new Calendario();
		}
		return instancia;
	}
}
