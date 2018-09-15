package com.reflection.mkyong;

import java.lang.reflect.Method;

public class ReflectApp {

	public static void main(String[] args) {
		
		// no parameter
		Class noparams[] = {};
		
		// String parameter
		Class[] paramString = new Class[1];
		paramString[0] = String.class;
		
		// int parameter
		Class[] paramInt = new Class[1];
		paramInt[0] = Integer.TYPE;

		try {
			
			// load the AppTest at runtime
			Class cls = Class.forName("com.reflection.mkyong.AppTest");
			Object obj = cls.newInstance();
			
			// call the printIt method
			Method method = cls.getDeclaredMethod("printIt", noparams);
			method.invoke(obj, null);
			
			// call the printItString method, pass a String param
			method = cls.getDeclaredMethod("printItString", paramString);
			method.invoke(obj, new String("mkyong"));
			
			// call the printItInt method, pass a int param
			method = cls.getDeclaredMethod("printItInt", paramInt);
			method.invoke(obj, 123);

			// call the setCounter method, apss a int param
			method = cls.getDeclaredMethod("setCounter", paramInt);
			method.invoke(obj, 999);
			
			// call the printCounter method
			method = cls.getDeclaredMethod("printCounter", noparams);
			method.invoke(obj, null);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
