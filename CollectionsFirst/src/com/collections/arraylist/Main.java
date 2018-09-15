package com.collections.arraylist;

public class Main {

	public static void main(String[] args) {

		int[] ar = new int[3];
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		CreatingArrayList testCase = new CreatingArrayList(); 
		testCase.TestCase(3);
		
		System.out.println(".........");
		testCase.TestCase(1);

	}

}

