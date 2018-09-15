package com.collections.list;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String args[]) {
		
		// This gives us nothing good
		System.out.println(args);
		
		// Convert args to a List of String
		// Arrays.asList() can be used for create Lists easily
		List<String> argList = Arrays.asList(args);
		
		// Print them out
		System.out.println("print 1: " + argList);
		
		// List can't be modified, it send an UnsupportedOperationException
		argList.add("10");

		// Print them out
		System.out.println("print 2:" + argList);		
	}
}
