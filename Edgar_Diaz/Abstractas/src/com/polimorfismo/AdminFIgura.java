package com.polimorfismo;

public class AdminFIgura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadrado c = new Cuadrado(5, "Cuadrado");
		Triangulo t = new Triangulo(4, 5, "Triangulo");
		mostrar(c);
		mostrar(t);

		//Figura f = new Figura(); // No se puede hacer new de una clase abstracta, error compilacion
		//     Comible c = new Comible(); // No se puede hacer new de una interface, error compilacion
	}

	public static void mostrar(Figura figura) {
		System.out.println(figura.getLabel());
		System.out.println(figura.calcularArea());

		// label de la figura
		// area de la figura
	}

}
