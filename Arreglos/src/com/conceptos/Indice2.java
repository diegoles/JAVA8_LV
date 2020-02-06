package com.conceptos;

public class Indice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]=new int[4];
		numbers[0]=3;
		numbers[1]=2;
		numbers[2]=6;
		int z[]=numbers;
		numbers[3]=4;
		
		for (int i=0;i<z.length;i++) {
			System.out.println(z[numbers[i]]);
		}

	}

}
