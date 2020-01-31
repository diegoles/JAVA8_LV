package com.localdate;

import java.time.LocalDate;
import java.time.Month;

public class CreacionLocalDate {

	public static void main(String[] args) {
		// LocalDate no se debe instanciar
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		//Sumar numero de dias
		ld.plusDays(5);	//los metodos son inmutables, no modifican el localDate original.
		System.out.println(ld);
		ld = ld.plusDays(5); // Se debe hacer una asignacion, para modificar o en otra variable
		System.out.println(ld);

		LocalDate ld1 = LocalDate.of(2020, Month.JANUARY, 22);
		System.out.println(ld1);

		LocalDate ld2 = LocalDate.of(2020, 01, 22);
		System.out.println(ld2);
		
		//LocalDate ld4 = new LocalDate(); // LocalDate no se debe instanciar

	}

}
