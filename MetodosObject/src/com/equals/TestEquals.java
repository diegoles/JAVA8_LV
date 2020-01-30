package com.equals;

import com.tostring.Persona;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("ED");
		Persona p2 = new Persona("ED");
		Persona p3 = p2;
		
		if (p1 == p2) {
			System.out.println("== iguales p1 == p2");
		}
		
		// 2 referencias son iguales con ==
		// si y solo si apuntan al mismo objeto
		if (p3 == p2) {
			System.out.println("== iguales p3 == p2");
		}
		// equals en Object hace lo mismo que ==
		if (p1.name.equals(p2.name)) {
			System.out.println("Equals iguales p1 == p2");
		}
		
		// 2 referencias son iguales con ==
		// si y solo si apuntan al mismo objeto
		if (p3.equals(p2)) {
			System.out.println("Equals iguales p3 == p2");
		}
		
		if (p1.name.equals(p2.name)) {
			System.out.println("Equals iguales p1.name == p2.name");
		}
	}

}
