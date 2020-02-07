package com.ambito;

public class Invocacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var = 10;
		metodo1(var);
		System.out.println(var);
	}
	
	// Otro "var", otra varible en metodo1. Solo se copia el valor "nada mas"
	public  static void metodo1(int var) {  
		var=5;
	}

}
