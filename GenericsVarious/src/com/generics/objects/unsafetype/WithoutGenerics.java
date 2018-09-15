package com.generics.objects.unsafetype;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {

	public static void main(String args[]) {
		List list = new ArrayList();
		list.add("abc");
		list.add("def");
		
		System.out.println("list:" + list);
		for(Object obj: list) {
			String str = (String) obj;
			System.out.println("string:" + str);
		}
		
	}
}
