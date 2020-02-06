package com.stringsbuffer;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer sb="bb";
		StringBuffer sb = new StringBuffer();  //ThreadSafe - sincronized, ThreadSafe si varios hilos quieres acceder al mimso metodo solo lo haría uno a la vez
		StringBuffer s1 = new StringBuffer("original");
		s1.append("nuevo");
		
		// Los metodos StringBuffer, SI modifican la cadena original. String no modifica la cadena original.
		
		System.out.println(s1);
	}

}
