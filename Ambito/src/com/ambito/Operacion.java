package com.ambito;

public class Operacion {
	int x=10;
	int y=20;
	
	public void metodo1() {
		int x;
		//System.out.println(x);  // No esta inicilizada la "x" en el ambito local
		//int res=x+y;   // "x" no esta inicilizado.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operacion o=new Operacion();
		o.metodo1();
	}

}
