package com.herencia;

public class Cuenta {
	double monto;

	public void agregar(double valor) throws MyException { // DEBO COLOCAR QUE LANZO UN CHECKED
		if (valor < 0) {
			throw new MyException(); // CHECKED
		}
		monto += valor;
	}

	public void retirar(double valor) {
		if (valor < 0) {
			throw new AnotherException(); // UNCHECKED
		}
		monto += valor;
	}
	
	public void metodo1() throws Exception{};   // puedo lanzar sin implementaciones
	public void metodo2() throws RuntimeException{};  // puedo lanzar sin implementaciones
	
	public void metodo3() {
		agregar(1.0);  // tratar o propagar la excepcion
		retirar(1.0);
		metodo1(); // tratar o propagar la excepcion
		metodo2();
	}

	// Tratar la excepcion
	public void metodo4() {
		try {
			agregar(100);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Propagar la excepcion
	public void metodo5() throws MyException {
		agregar(100);
	}
	
	public void metodoAsignacion() throws Exception{
		double x = Math.random()*10;
		Exception ex = (x<5)?new Exception():new RuntimeException();
		throw ex;
	}
}
