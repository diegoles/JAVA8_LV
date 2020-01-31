package com.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConvertirLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalDateTime ldt = ld.atTime(23, 43);
		System.out.println(ldt);

		LocalDateTime ldt1 = ld.atStartOfDay();
		System.out.println(ldt1);
	}

}
