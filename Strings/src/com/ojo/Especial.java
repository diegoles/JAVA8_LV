package com.ojo;

public class Especial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SUBSTRING => devulve otra cadena simpre para todos STring, StringBuilder, StringBuffer
		
		String cadena = "original";
		StringBuffer buffer = new StringBuffer("inicial");
		cadena.substring(0,3);
		buffer.substring(0,3);
		
		System.out.println(cadena);
		System.out.println(buffer);
		
		cadena.substring(4); // de la posicion 4 en adelante
		//cadena.substring(4,100); // valida inicio y final
		
		
	}

}
