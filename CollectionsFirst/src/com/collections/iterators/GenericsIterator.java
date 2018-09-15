package com.collections.iterators;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GenericsIterator {

	public static <T> List<T> reverse(List<T> src) {
		List<T> arrayList = new ArrayList<T>(src);
		Collections.reverse(arrayList);
		System.out.println("arrayList:" + arrayList);
		
		AbstractList<T> abstractList = new ArrayList<T>(src);
		Collections.reverse(abstractList);
		System.out.println("abstractList:" + abstractList);
		
		Set<String> results2 = new TreeSet<>();

		arrayList.add((T) new Person("Ted2", "Neward2", 29));
		abstractList.add((T) new Person("Ted4", "Newar4", 49));
		
		System.out.println("arrayList 2:" + arrayList);
		System.out.println("abstractList 2:" + abstractList);
		
		return arrayList;
	}
	
}
