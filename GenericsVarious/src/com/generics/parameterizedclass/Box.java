package com.generics.parameterizedclass;

public class Box<T> {
	
	private T t;

	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();
		
		integerBox.add(new Integer(10));
		stringBox.add(new String("Hello World"));
	
		System.out.printf("Integer Value: %d\n\n", integerBox.get());
		System.out.printf("String Value: %s\n\n", stringBox.get());
	}
	
	public void add(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
}
