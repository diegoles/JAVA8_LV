package com.flujo;

public class TestBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = { 4, 5, 6, 7 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 5) {
				break; // sale del for
			}
			System.out.println(numbers[i]);
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 5) {
				continue; // Se salta el numero 5 y continua con la ejecucion
			}
			System.out.println(numbers[i]);
		}
	}

}
