package com.tostring;

public class Cliente {
	public String nombre;

	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.nombre.equals(((Cliente) obj).nombre)) {
			return true;
		}
		return false;

	}

}
