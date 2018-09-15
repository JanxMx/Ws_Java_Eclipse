package com.collections.iterators;

public class App {

	public static void main(String args[]) {
		Person ted = new Person("Ted", "Neward", 39,
				new Person("Michael", "Neward", 16),
				new Person("Matthew", "Neward", 10));
		
		// Iterate over the kids
		for(Object obj: ted) {
			System.out.println(((Person)obj).getFirstName());
		}	
	}
}
