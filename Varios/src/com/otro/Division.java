package com.otro;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 2;

		double res = x / y; // resultado es un entero
		System.out.println(res); // 2.0

		int x1 = 5;
		int x2 = 2;

		double res1 = x1 / (double) x2; // a uno le hago un doble, como toma el mayor
		System.out.println(res1);// 2.5
	}

}
