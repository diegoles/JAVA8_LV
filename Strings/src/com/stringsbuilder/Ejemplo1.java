package com.stringsbuilder;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer sb="bb";
		StringBuilder sb = new StringBuilder();
		StringBuilder s1 = new StringBuilder("original");
		s1.append("nuevo");
		
		// Los metodos StringBuffer, SI modifican la cadena original. String no modifica la cadena original.
		
		System.out.println(s1);
	}

}
