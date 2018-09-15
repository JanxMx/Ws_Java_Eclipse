package com.reflection.access.privates.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	
	public void testPrivateStatic() throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {

		
		BaseClass baseClass = new BaseClass();
		Class bc = baseClass.getClass();
		
		System.out.println("---------- get methods by instance ----------");
		
		Method m3 = bc.getDeclaredMethod("method3", null);
		m3.setAccessible(true);
		m3.invoke(null, null);
		
		Method method10 = bc.getDeclaredMethod("method10", null);
		method10.setAccessible(true);
		// if method is static first argument is null
		// subsequent arguments are the method's parameters
		method10.invoke(null, null);

		Method method11 = bc.getDeclaredMethod("method11", null);
		method11.setAccessible(true);
		// if method is static first argument is null
		// subsequent arguments are the method's parameters
		Integer x11 = (Integer) method11.invoke(null, null);
		
		Class[] cArg12 = new Class[1];
		cArg12[0] = Integer.class; 
		Method method12 = bc.getDeclaredMethod("method12", cArg12);
		method12.setAccessible(true);
		// if method is static first argument is null
		// subsequent arguments are the method's parameters
		Integer x12 = (Integer) method12.invoke(bc, 50);
		
		Class[] cArg13 = new Class[1];
		cArg13[0] = Integer.class; 
		Method method13 = bc.getDeclaredMethod("method13", cArg13);
		method13.setAccessible(true);
		// if method is static first argument is null
		// subsequent arguments are the method's parameters
		Integer x13 = (Integer) method13.invoke(baseClass, 113);		 		

		
		System.out.println("\n---------- get methods by reference ----------");

		// invoking private method
		Method method3 = Class.forName("com.reflection.access.privates.methods.BaseClass").getDeclaredMethod("method3", null);
		method3.setAccessible(true);
		method3.invoke(null, null);					// prints "Method3"
		
		Class cls = Class.forName("com.reflection.access.privates.methods.BaseClass");
		Object obj13 = cls.newInstance();
		// int parameter
		Class[] paramInt = new Class[1];
		paramInt[0] = Integer.class;
		// call the printItInt method, pass a int param
		Method methodX = cls.getDeclaredMethod("method13", paramInt);
		methodX.setAccessible(true);
		methodX.invoke(obj13, 123);
		
		
		/*
		Method method10 = Class.forName("com.reflection.two.BaseClass").getDeclaredMethod("method10", null);
		method10.setAccessible(true);
		method10.invoke(null, null);	
		
		Method method4 = Class.forName("com.reflection.two.BaseClass").getDeclaredMethod("method4", int.class);
		method4.setAccessible(true);
		method4.invoke(null, null);					// prints "Method4"
		*/
	}

}
