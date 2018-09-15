package com.collections.iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseIterator {

	public static void main(String[] args) {
		Person ted = new Person("Ted", "Neward", 39,
				new Person("Michael", "Neward", 16),
				new Person("Matthew", "Neward", 10)
				);

		// Make a copy of the List
		List<Person> kids = new ArrayList<Person>(ted.getChildren());

		// Display it
		System.out.println("NORMAL: " + kids);		
		
		// Reverse it
		Collections.reverse(kids);
		
		// Display it reverse
		System.out.println("REVERSE: " + kids);
	}

}
