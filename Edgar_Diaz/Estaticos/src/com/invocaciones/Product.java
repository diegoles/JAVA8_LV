package com.invocaciones;

public class Product {
	static int code;
	double price;
	
	public Product(int code, double price) {
		this.code=code;
		this.price=price;
	}
	
	public static void metodo1(int code, double price) {
		//this.code=code;  // this no existe en los metodos estaticos
		//this.price=price; // this no existe en los metodos estaticos
	}
}
