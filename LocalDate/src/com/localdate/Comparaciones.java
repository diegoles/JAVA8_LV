package com.localdate;

import java.time.LocalDate;

public class Comparaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld1 = LocalDate.now();
		LocalDate ld2 = ld1.minusDays(3);
		LocalDate ld3 = LocalDate.now();

		boolean res = ld1.isAfter(ld2);
		System.out.println(res);

		boolean res1 = ld1.isBefore(ld2);
		System.out.println(res1);

		boolean res2 = ld1.isEqual(ld3);
		System.out.println(res2);
		
		// En localDate el equal si esta sobreescrito y compara valores con el String e Integer
		boolean res3 = ld1.equals(ld3);
		System.out.println(res3);
		
		// Con == deben estar apuntando al mismo objeto.
		boolean res4=ld1==ld3;
		System.out.println(res4);

	}

}
