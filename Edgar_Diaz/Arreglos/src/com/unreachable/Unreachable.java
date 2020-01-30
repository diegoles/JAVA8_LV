package com.unreachable;

public class Unreachable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arreglo[] = { 2, 3 };
		for (int val : arreglo) {
			if (val == 5) {
				break;
				System.out.println(val); //Unreachable code, error de compilacion
			}

		}
	}

}
