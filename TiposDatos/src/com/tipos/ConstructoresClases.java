package com.tipos;

public class ConstructoresClases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(10);
		Integer i1 = new Integer("20");
		// Integer i2 = new Integer("OtraCosa"); // NumberFormatExcepction => unchecked

		Boolean b = false;
		Boolean b1 = new Boolean("TrUe");
		Boolean b2 = new Boolean("java");

		System.out.println(b + " " + b1 + " " + b2);
		
		//Integer.parseInt("dfsfd");  // Error ejecucion NumberFormatExcepction => unchecked
		
		
		Boolean b3 = Boolean.parseBoolean("xxxxx");  //false
		System.out.println(b3);
		
		boolean xx = new Boolean(Boolean.parseBoolean("xxxx")); //false  AUtoboxing en la asignacion
		System.out.println(xx);
	}

}
