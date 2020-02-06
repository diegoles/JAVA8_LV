package com.herencia;

public class Gato extends Animal{
 
	//comer
	@Override
	public void comer() {
		System.out.println("Gato comiendo");
	}
	
	public void maullar() {
	 System.out.println("Gato maullando");
	 }
 
}
