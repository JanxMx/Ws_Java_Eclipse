package com.interfaces;

public class MyInterfaceImpl implements MyInterface {
	
	public void sayHello() {
		System.out.println("Hello 1: " + MyInterface.hello);
		System.out.println("Hello 2: " + this.hello);
		//MyInterface.hello = "Other message";							// ERROR: the interface variables are inmutables
		System.out.println("Hello 3: " + MyInterface.hello);
		
	};

}
