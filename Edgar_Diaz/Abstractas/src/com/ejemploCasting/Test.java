package com.ejemploCasting;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Auto();
		Vehicle v2 = new Airplane();
		// v2 queda como vehicule, verificar las asignaciones no loes casting
		v2 = (Vehicle) v1;   // No cambia de tipo, no cambia a tipo Vehicle.
		Auto a = (Auto) v2;
		Vehicle v3 = a;
		v3.move();

	}

}
