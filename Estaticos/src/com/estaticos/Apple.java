package com.estaticos;

public class Apple {
	int price;
	static int count;

	public Apple() {
		++this.price;
		++count;// ++Apple.count
	}

	public static void main(String... args) {
		++count;
		Apple a = new Apple();
		Apple b = new Apple();
		System.out.println(count + "  -> " + a.price);

	}
}
