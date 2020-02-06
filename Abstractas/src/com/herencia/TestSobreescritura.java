package com.herencia;

public class TestSobreescritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato g = new Gato();
		g.comer();
		
		Animal a = new Gato();
		a.comer();
		
		Animal a1 = new Animal();
		a1.comer(); // Animal comiendo
		a1=a;
		a1.comer(); // Gato comiendo
	}

}
