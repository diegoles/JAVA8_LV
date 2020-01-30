package com.flujo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = null;
		try {
			a.trim(); // NullPoninter
			System.out.println("A");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error CATCH 1");
		} catch (NullPointerException e) {
			System.out.println("Error CATCH 2 NullPointer");//UNREACHABLE CODE!! SI ESTA AL ULTIMO DESPUES DE eXCEPTION
		} catch (Exception e) {
			System.out.println("Error CATCH 3");
		}
		System.out.println("FIN");
	}

}
