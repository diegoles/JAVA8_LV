package com.modificadores;

public class MismoPaquete {
	public void probarAcceso() {
		Contenedor c = new Contenedor();
		c.varPublic = 10;     // si puede acceder
		c.varProtected = 10;   // si puede acceder por que esta en el mismo paquete
		c.varDefault = 10;		//  si puede acceder por que esta en el mismo paquete
		//c.varPrivate = 20;
	}
}
