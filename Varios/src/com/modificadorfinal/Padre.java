package com.modificadorfinal;

public class Padre {
	// Un metodo final no puede ser sobreescrito.
	public final void metodo1() {
		
	}
}


class Hijo extends Padre{
	// Un metodo final no puede ser sobreescrito.
	public void metodo1() {
		
	}
}