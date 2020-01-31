package com.tipos;

public class AutoBoxing {

	int z; // 0
	Integer myInteger; // null

	public static void main(String[] args) {
		Integer i = 100; // i = new Integer(100);
		int x = i; // x=i.intValue();
		int suma = x + i; // suma = x+i.intValue();

		AutoBoxing ab = new AutoBoxing();
		int rest = ab.myInteger - 5; // ab.myInteger.intValue(); Esto da NullPointerException
	}

}
