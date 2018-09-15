package com.generics.interfaces;

public class Principal {

	public static void main(String args[]) {
		Comparable comparable = new ComparableImpl();
		
		System.out.println("resultado 1: " + comparable.compareTo("uno", 100));
		System.out.println("resultado 2: " + comparable.compareTo(100, 100));
		System.out.println("resultado 2: " + comparable.compareTo("a", "a"));
	}
}
