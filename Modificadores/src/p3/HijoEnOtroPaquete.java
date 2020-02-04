package p3;

import com.modificadores.Contenedor;

public class HijoEnOtroPaquete extends Contenedor {
	public void probarAcceso() {
		Contenedor c = new Contenedor();
		c.varPublic = 10;
		varPublic = 11;
		varProtected = 12; // Acceso sin la instancia, esto se debe por la herencia.

		varPublic = 10;
		varProtected = 20;
		// c.varProtected = 10;
		// c.varDefault = 10;
		// c.varPrivate = 20;
	}
}
