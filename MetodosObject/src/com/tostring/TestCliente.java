package com.tostring;

public class TestCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente("C1");
		Cliente c2 = new Cliente("C1");
		// Por que se sobreescribe el equals, tambien se debe sobreeescribir el hascode
		// obligatoriamente
		if (c1.equals(c2)) {
			System.out.println("Equals c1.equals(c2)");
		}

		String a1 = "abc";
		String a2 = "a";
		String a3 = a2 + "bc"; // abc
		// En String si sobreescribe el toString y tambien Equals, por eso si funciona. Y compara valores
		// En String si sobreescribe Equals, por eso si funciona.
		if (a1.equals(a3)) {
			System.out.println("a1.equals(a3)");
		}

		// En Integer si sobreescribe Equals, por eso si funciona, y compara valores
		Integer i1 = 200;
		Integer i2 = 200;
		if (i1.equals(i2)) {
			System.out.println("i1.equals(i2)");
		}
		
		// No son iguales con ==, no apuntan al mismo Objeto
		// Son iguales si y solo si apuntan al mismo objeto
		if (a1 == a3) {
			System.out.println("a1==a3");
		}

		// No son iguales con ==, no apuntan al mismo Objeto
		// Son iguales si y solo si apuntan al mismo objeto
		if (i1 == i2) {
			System.out.println("i1 == i2");
		}
	}

}
