package com.stringsbuffer;

import java.nio.Buffer;

public class MetodosStringBuilderOStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abc");
		sb.append("xyz");
		System.out.println(sb);

		StringBuffer sb1 = new StringBuffer("liga");
		sb1.reverse();
		System.out.println(sb1);

		StringBuffer sb2 = new StringBuffer("Certificacion"); // rango [incluido, excluido[
		sb2.delete(0, 2); // start incluido, end excluido
		System.out.println(sb2);

		sb2.delete(4, 100); // No valida el end, si valida el start
		System.out.println(sb2);

		// sb2.delete(100, 101); // No valida el end, si valida el start
		// System.out.println(sb2); //java.lang.StringIndexOutOfBoundsException

		// sb2.delete(2, 1); // error ejecucion
		// java.lang.StringIndexOutOfBoundsException
		// System.out.println(sb2);

		// StringBuilder cadena0 = new StringBuilder(); // eror ejecucion
		// cadena0.insert(2, "XXX"); // java.lang.StringIndexOutOfBoundsException

		StringBuilder cadena = new StringBuilder("Constructores");
		cadena.insert(2, "XXX");
		System.out.println(cadena);

		StringBuilder builder = new StringBuilder("abcdef");
		builder.replace(1, 3, "ppppp");
		System.out.println(builder);
		
	}

}
