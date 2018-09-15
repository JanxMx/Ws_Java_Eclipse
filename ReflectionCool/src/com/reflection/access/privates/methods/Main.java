package com.reflection.access.privates.methods;

import java.lang.reflect.InvocationTargetException;

public class Main {
	
	public static void main(String[] args) {
		
		Test test2 = new Test();
		try {
			test2.testPrivateStatic();
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException | InstantiationException e) {
			e.printStackTrace();
		}
	}
	
}

