package com.reflection.access.privates.methods;

public class BaseClass {
	
	public int baseInt;
	
	private static void method3() {
		System.out.println("Method3");
	}

	private static void method10() {
		System.out.println("Method10: " + 0);
	}

	private static int method11() {
		System.out.println("Method11: " + 0);
		return 10;
	}

	private static int method12(Integer in) {
		System.out.println("Method12: " + in);
		return in;
	}

	private int method13(Integer in) {
		System.out.println("Method13: " + in);
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
