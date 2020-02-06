package com.invocaciones;

public class Test {
	static int varEstatica;
	public static void main(String[] args) {
		varEstatica = 10; //ok
		Test.varEstatica= 20;   //ok
		Test t1= new Test();
		t1.varEstatica = 30; // Test.varEstatica
		new Test().varEstatica = 40; // Test.varEstatica
	}

}
