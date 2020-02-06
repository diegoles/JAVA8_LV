package com.strings;

public class MetodosString {
	public static void main(String[] args) {
		String cadena = " abc xyz ";
		String nueva = cadena.trim();

		System.out.println(nueva);
		System.out.println(nueva.length());
		System.out.println(cadena);
		System.out.println(cadena.length());

		String c1 = "abc";
		String nuevac1 = c1.toUpperCase();
		System.out.println(c1 + "  " + nuevac1);

		String c2 = "xyz";
		String nuevac2 = c1.toLowerCase();
		System.out.println(c2 + "  " + nuevac2);

		// ISEMPTY
		// SI y solo SI <=> String de longitud 0
		String nulo = null;
		String vacio = "";
		String noVacio = " ";
		// System.out.println(nulo.length());
		System.out.println(vacio.length()); // 0
		System.out.println(noVacio.length()); // 1
		System.out.println(vacio.isEmpty());
		System.out.println(noVacio.isEmpty());

		String letras[] = { "H", "o", "l", "a" };
		String saludo = "";
		String hola = "Hola";
		String otroHola = "hola";
		for (String string : letras) {
			saludo += string; // No se debería hacer en la vida real, utilizar StringBuffer o StrinBuilder
		}

		boolean res1 = saludo == otroHola; // false, Apuntan a diferentes lugares
		boolean res3 = saludo.equals(hola); // true
		boolean res2 = saludo.equals(otroHola);// false, Hola hola compara contenidos por que tiene sobreescritura
		boolean res4 = saludo.equalsIgnoreCase(otroHola); // true , no le interesan mayusculas y minusculas

		String curso = "certi java";
		String nuevoCurso = curso.concat(" LV");
		System.out.println(curso);
		System.out.println(nuevoCurso);

		String nombre = "Mono";
		String nombreModi = nombre.replace("o", "e");
		System.out.println(nombre);
		System.out.println(nombreModi);

	}
}
