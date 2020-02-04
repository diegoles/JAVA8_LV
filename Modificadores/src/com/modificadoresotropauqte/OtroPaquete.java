package com.modificadoresotropauqte;

import com.modificadores.Contenedor;

public class OtroPaquete {
	public void probarAcceso() {
		Contenedor c = new Contenedor();
		c.varPublic = 10;    
		//c.varProtected = 10; 
		//c.varDefault = 10;	
		//c.varPrivate = 20;
	}
	
}
