package com.estaticos;

public class TestEstaticos {
	int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);   // main es estatico, pero x no es estatico.
		metodo2();  // metodo2 no es estatico
		metodo3(); // Entre estaticos si se puede
	}

	void metodo2() {
		
	}
	
	static void metodo3() {
		
	}
}
