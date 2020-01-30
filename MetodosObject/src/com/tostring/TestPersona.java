package com.tostring;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("Edgar");
		System.out.println(p);// p.toString()
		// com.tostring.Persona@15db9742 fullName + hashCode
		// com.tostring.Persona = fullName
		// 15db9742 = hashCOde

		Persona personas[] = new Persona[2];
		personas[0] = new Persona("E1");
		System.out.println(personas);
		// [Lcom.tostring.Persona;@6d06d69c
		// [L = colleccion
		// com.tostring.Persona = fullName
		// 6d06d69c = hashCOde

		System.out.println(personas[0]);
		// com.tostring.Persona@15db9742 fullName + hashCode
		// com.tostring.Persona = fullName
		// 15db9742 = hashCOde

		System.out.println(personas[0].name);
		System.out.println(personas[1]);
		System.out.println(personas[1].name);// NullPointer
		
		
	}

}
