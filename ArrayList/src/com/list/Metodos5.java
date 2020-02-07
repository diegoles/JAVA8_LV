package com.list;

import java.util.ArrayList;

public class Metodos5 {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Cliente p1 = new Cliente("Cliente1");
		clientes.add(p1);
		clientes.add(new Cliente("Cliente2"));
		clientes.add(new Cliente(null));
		clientes.add(new Cliente("Cliente3"));
		// NO esta sobreescrito el toString en Persona
		System.out.println(clientes);// [Cliente [nombre=Cliente1], Cliente [nombre=Cliente2], Cliente [nombre=null], Cliente [nombre=Cliente3]]

		// Remueve por que esta sobreescrito el equal en Cliente.
		clientes.remove(new Cliente("Cliente1"));
		System.out.println(clientes); // [Persona [nombre=Cliente2], Persona [nombre=null], Persona [nombre=Cliente3]]

	}

}
