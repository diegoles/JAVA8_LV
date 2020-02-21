package com.incremental;

public class Test {

	static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = i + 1;
		if ((a++ > ++b) && (++a > 5)) {
			a += b;
		}
		System.out.println(a);// 3
	}

}
