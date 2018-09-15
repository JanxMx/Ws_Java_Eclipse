package com.reflection.all;

public class BaseClass {
	
	public int baseInt;
	
	private static void method3() {
		System.out.println("Method3");
	}

	private Integer method10(Integer in) {
		System.out.println("Method10: " + in);
		return in;
	}
	
	private int method4() {
		System.out.println("Method4");
		return 0;
	}

	private static int method5() {
		System.out.println("Method5");
		return 0;
	}
	
	void method6() {
		System.out.println("Method6");
	}

	// inner public class
	public class BaseClassInnerClass{}

	// member public enum
	public enum BaseClassMemberEnum{}
	
}
