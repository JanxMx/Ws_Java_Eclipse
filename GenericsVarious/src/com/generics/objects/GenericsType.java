package com.generics.objects;

public class GenericsType<T> {
	
	private T t;

	public static void main(String args[]) {
		GenericsType<String> type = new GenericsType<>();
		type.set("PankaJ");		// valid
		
		GenericsType type1 = new GenericsType();	//raw type
		type1.set("Pankaj");	// valid
		type1.set(10);			// valid and autoboxing support
		
		System.out.println("type:" + (String) type.get());
		System.out.println("type1:" + (Object) type1.get());
	}
	
	public T get() {
		return this.t;
	}
	
	public void set(T t1) {
		this.t = t1; 
	}
	
}
