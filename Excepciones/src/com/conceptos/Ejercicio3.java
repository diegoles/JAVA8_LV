package com.conceptos;

import java.io.File;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("archivo1.txt");
		f.createNewFile();	//checked. es hija de Excepction y no es RuntimeException
		
		// tipos de excepcion: checked or unchecked
		
		// RuntimeExcepcion y sus hijas son: Unchecked, como arrayIndex, nullPointer, castingException
		// SI heredo de Exception y no es RuntimeExcepcion, => es checked
		// Exception es checked
		
	}

}
