package com.bolsa.withoutgenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa implements Iterable {
	private ArrayList lista = new ArrayList();
	private int tope;
	
	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}

	public void add(Object objeto) {
		if(lista.size()<tope) {
			lista.add(objeto);
		}else {
			System.out.println("no caben mas");
			throw new RuntimeException("no caben mas");
		}
	}
	
	public Iterator iterator() {
		return lista.iterator();
	}
}
