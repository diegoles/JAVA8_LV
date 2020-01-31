package com.localdate;

import java.time.LocalDateTime;
import java.time.Month;

public class CreacionLocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LocalDateTime no se debe instanciar
		LocalDateTime ld = LocalDateTime.now();
		System.out.println(ld);
		
		//Sumar numero de dias
		ld.plusDays(5);	//los metodos son inmutables, no modifican el localDate original.
		System.out.println(ld);
		ld = ld.plusDays(5); // Se debe hacer una asignacion, para modificar o en otra variable
		System.out.println(ld);
		
		//Sumar numero de dias
		ld.plusMonths(1);	//los metodos son inmutables, no modifican el localDate original.
		System.out.println(ld);
		ld = ld.plusMonths(1); // Se debe hacer una asignacion, para modificar o en otra variable
		System.out.println(ld);
		

		LocalDateTime ld1 = LocalDateTime.of(2020, Month.JANUARY, 22, 23, 4);
		System.out.println(ld1);

		LocalDateTime ld2 = LocalDateTime.of(2020, 01, 22, 23, 4, 59);
		System.out.println(ld2);

		LocalDateTime ld3 = LocalDateTime.of(2020, 01, 22, 23, 4, 59, 555);
		System.out.println(ld3);

		// LocalDateTime ld4 = new LocalDateTime(); // LocalDateTime no se debe  instanciar
	}

}
