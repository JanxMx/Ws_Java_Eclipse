package com.generics.bolsa.two;

public class Chocolatina extends Dulce {
	String marca;

	public Chocolatina(String tipo, String marca) {
		super(tipo);
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
