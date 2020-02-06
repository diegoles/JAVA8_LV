package com.strings;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Vecinas";
		String nueva = cadena.toUpperCase();
		System.out.println(cadena);
		System.out.println(nueva);

		String cadena1 = "   Vecinas   123   ";
		String nueva1 = cadena1.trim();
		System.out.println(cadena1);
		System.out.println(nueva1);
		
		// No es recomendable crear cadenas innecesarias con String, si se va a manipular cadenas
		// Se debe utilizar StringBuffer o StringBuilder
		// Ya que con String no se eliminar las instancias.
	}

}
