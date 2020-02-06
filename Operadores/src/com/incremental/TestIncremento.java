package com.incremental;

public class TestIncremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int z = x++; // x sigue valiendo 10, la siguiente vez que se utilice va a tener 11
		System.out.println("z: " + z);
		System.out.println("x: " + x);

		int t = 10;
		int q = ++t; // t vale 11 y q vale 11
		System.out.println("q: " + q);
		System.out.println("t: " + t);

		int count = 3;
		System.out.println("count: " + count++);

		if (count > 3) {
			System.out.println("count: " + count);
		}

	}

}
