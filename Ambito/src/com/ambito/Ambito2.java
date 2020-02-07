package com.ambito;

public class Ambito2 {

	public static void main(String[] args) {
		int x = 10;
		try {
			//int x = 10;   // Variable local ya existente, solo se debe tener una variable local con el nombre unico
			System.out.println(x);
			
			if (true) {
				//int x=0;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(x);  // No hay x, no esta definida
		}
		
		System.out.println(x);  // No hay x, no esta definida
	}

}
