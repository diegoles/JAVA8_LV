package com.modificadorfinal;

import java.util.ArrayList;
import java.util.List;

public class Atributos {
	// Como no se puede modificar por el final y debe ser instanciado.
	final int entero = 4;
	static final int RANGO = 20;
	
	final List<String> cadenas = new ArrayList<>();
	
	public void metodo1() {
		double pi = Math.PI;
		
		cadenas.add("Hola"); // No cambia el puntero.
		
		//cadenas=null; // No se puede asignar, o no puede adquirir otro valor.
	}
	
}
