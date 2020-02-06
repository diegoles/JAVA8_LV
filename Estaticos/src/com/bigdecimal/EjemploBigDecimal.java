package com.bigdecimal;

import java.math.BigDecimal;

public class EjemploBigDecimal {

	public static void main(String[] args) {
		BigDecimal valor1 = BigDecimal.valueOf(10);
		BigDecimal valor2 = BigDecimal.valueOf(5);

		System.out.println(valor1 + "===>" + valor2);
		calculo(valor1, valor2);
		System.out.println(valor1 + "===>" + valor2);
	}

	public static void calculo(BigDecimal valor1, BigDecimal valor2) {
		BigDecimal r1 = valor1;
		BigDecimal r2 = valor2;

		System.out.println(r1 + "==" + r2);
		r1 = BigDecimal.ONE;
		r2 = BigDecimal.ZERO;
		System.out.println(r1 + "==" + r2);
		System.out.println(valor1 + "===>" + valor2);

	}

}
