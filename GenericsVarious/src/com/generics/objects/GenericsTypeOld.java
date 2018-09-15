package com.generics.objects;

public class GenericsTypeOld {
	
	private Object t;

	public static void main(String args[]) {
		GenericsTypeOld type = new GenericsTypeOld();
		type.set("PankaJ");
		String str = (String) type.get();
		System.out.println("String:" + str);
		
		type.set(100);
		Integer number = (Integer) type.get();
		//tring str = (String) type.get();	// type casting, errore prone and can cause ClassCastException
		System.out.println("int:" + number);
	}
	
	public Object get() {
		return t;
	}
	
	public void set(Object t) {
		this.t = t; 
	}
	
}
