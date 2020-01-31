package com.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parsear {

	public static void main(String[] args) {
		//LocalDate ld1 = LocalDate.parse("holamundo"); // Error de ejecucion
		
		LocalDate ld = LocalDate.parse("2020-01-15");
		System.out.println(ld);
		
		LocalDate ld1 = LocalDate.parse("2020-01-15", DateTimeFormatter.ISO_DATE);
		System.out.println(ld1);
		
		//LocalDate ld2 = LocalDate.parse("2020-01-15", DateTimeFormatter.ISO_DATE_TIME);
		//System.out.println(ld2); // Error de ejecucion
		
		LocalDate ld3 = LocalDate.parse("2020-01-15T12:24", DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(ld3);
		
	}

}
