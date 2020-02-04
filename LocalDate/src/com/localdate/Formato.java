package com.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class Formato {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.of(2020, 02, 14);
		String cadena = ld.format(DateTimeFormatter.ISO_DATE);
		System.out.println(cadena);

		String cadena1 = ld.format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(cadena1);

		//String cadena2 = ld.format(DateTimeFormatter.ISO_DATE_TIME); //UnsupportedTemporalTypeException
		//System.out.println(cadena2); // No tiene horas y minutos, error de ejecucion
		
		String cadena3 = ld.atTime(22,40).format(DateTimeFormatter.ISO_DATE_TIME); //UnsupportedTemporalTypeException
		System.out.println(cadena3);
		
		LocalDateTime ldt = LocalDateTime.now();
		String cadena4 = ldt.format(DateTimeFormatter.ISO_DATE); 
		System.out.println(cadena4);

		String cadena5 = ldt.format(DateTimeFormatter.ISO_DATE_TIME); 
		System.out.println(cadena5);
		
		
		LocalDate ld1 = LocalDate.parse("2020-01-25T00:35", DateTimeFormatter.ISO_DATE_TIME);
		String formated = ld1.format(DateTimeFormatter.ISO_DATE);
		System.out.println("formated:" + formated);
		
		LocalDate ld2 = LocalDate.parse("2020-01-25", DateTimeFormatter.ISO_DATE_TIME);
		String formated2 = ld1.format(DateTimeFormatter.ISO_DATE);
		System.out.println("formated:" + formated2); // error ejecucion java.time.format.DateTimeParseException
		
	}

}
