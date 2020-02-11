package com.errores;

import java.util.ArrayList;
import java.util.List;

public class EjercicioError {
	// Throwable es el padre de Exception y Error
	public static void main(String[] args) {
		// de la excepcion me puedo recuperar
		// del error no siempre me puedo recuperar
		try {
			List<String> str = new ArrayList<>();
			while (true) {
				str.add("FIN"); // OutOfMemoryError
			}
		} catch (Exception e) {
			System.out.println("Exception");
		} catch (Error e) {
			System.out.println("Error"); // No es garantia que ingrese en Error.
		} catch (Throwable e) {
			System.out.println("Error"); // No es garantia que ingrese en Error.
		}
		
		try {
			List<String> str = new ArrayList<>();
			while (true) {
				str.add("FIN"); // OutOfMemoryError
			}
		} catch (Throwable e) {
			System.out.println("Throwable"); // No es garantia que ingrese en Throwable.
		}
		
	}

}
