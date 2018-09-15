package com.reflection.first;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		
		// Without reflection
		System.out.println("--------------- without reflection ---------------");
		Foo foo = new Foo();
		foo.hello();
		
		// With reflection
		System.out.println("----------------- with reflection ----------------");

		// 1- Creating instance
		Object foo2 = null;
		try {
			foo2 = Class.forName("com.reflection.first.Foo").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		// Alternatively: Object foo = Foo.class.newInstance();

		// 2- Getting method
		Method m1 = null;
		Method m2 = null;
		try {
			m1 = foo2.getClass().getDeclaredMethod("helloReflection1", new Class<?>[0]);
			m2 = foo2.getClass().getDeclaredMethod("helloReflection2", new Class<?>[0]);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		// 3- Execute the method
		try {
			m1.invoke(foo2);
			m2.invoke(foo2);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}

}

class Foo {
	
	public void hello() {
		System.out.println("prueba sin reflection realizada exitosamente");
	}

	public void helloReflection1() {
		System.out.println("ejecutando metodo con reflection exitosamente");
	}
	
	public void helloReflection2() {
		System.out.println("ejecutando otro metodo con reflection exitosamente");
	}
	
}