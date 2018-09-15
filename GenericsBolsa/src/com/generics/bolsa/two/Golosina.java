package com.generics.bolsa.two;

public class Golosina extends Dulce {

	private String nombre;
	
	public Golosina(String tipo, String nombre) {
		super(tipo);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
