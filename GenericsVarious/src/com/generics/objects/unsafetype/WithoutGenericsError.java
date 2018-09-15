package com.generics.objects.unsafetype;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenericsError {

	public static void main(String args[]) {
		List list = new ArrayList();
		list.add("abc");
		list.add(new Integer(5));	//OK
		
		for(Object obj: list) {
			// type casting leading to ClassCastException at runtime
			String str = (String) obj;
			System.out.println("String:" + str);
		}
		
	}
}
