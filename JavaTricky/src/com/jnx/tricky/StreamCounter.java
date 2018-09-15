package com.jnx.tricky;

import java.util.Arrays;
import java.util.List;

public class StreamCounter {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10, 12);
		
		long total = list.stream().count();
		
		System.out.println(total);
	}
}

//toCharArray
/*
- Spring
	int occurrences = String.utils.countOcurrenceOf("a.b.c.d.e.f",".");
- ??????
	int count = CharMatcher.is('.').countIn("a.b.c.d");
*/