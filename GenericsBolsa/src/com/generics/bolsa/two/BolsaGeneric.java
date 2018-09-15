package com.generics.bolsa.two;

import java.util.ArrayList;
import java.util.Iterator;

public class BolsaGeneric<T> implements Iterable {
	
	private ArrayList<T> lista = new ArrayList<>();
	private int tope;
	
	public BolsaGeneric(int tope) {
		super();
		this.tope = tope;
	}
	
	public void add(T objeto) {
		if(lista.size()<tope) {
			lista.add(objeto);
		}else {
			System.out.println("no caben mas");
		}
	}
	
	public Iterator<T> iterator() {
		return lista.iterator();
	}
}
