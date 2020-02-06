package com.comunes;

public class Comunes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "cadena";
		StringBuffer mensaje = new StringBuffer("mensaje");

		System.out.println(cadena); // cadena.toString()
		System.out.println(mensaje); // mensaje.toString()

		String a = "abc";
		String z = "c";
		String b = "ab" + z;

		boolean resString = a.equals(b);
		System.out.println(resString);

		StringBuffer sb1 = new StringBuffer("java 8");
		StringBuffer sb2 = new StringBuffer("java 8");
		boolean resBuffer = sb1.equals(sb2);
		System.out.println(resBuffer); // false, en StringBuffer y StringBuilder no sobreescriben equals
		
		
		
		// Metodos comunes para String, StringBuilder y StringBuffer
		String x = "Marco";
		System.out.println(x.length()); // para String, StringBuilder y StringBuffer
		
		StringBuilder builder = new StringBuilder("Marco");
		builder.indexOf("r"); // 2 // para String, StringBuilder y StringBuffer
		builder.indexOf("q"); // -1 // para String, StringBuilder y StringBuffer
		
		char c = builder.charAt(3); // para String, StringBuilder y StringBuffer
		System.out.println(c);
		
		
		
		//SUBSTRING => devulve otra cadena		
		

	}

}
