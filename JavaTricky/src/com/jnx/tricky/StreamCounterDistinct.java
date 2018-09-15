package com.jnx.tricky;

import java.util.Arrays;
import java.util.List;

public class StreamCounterDistinct {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("GFG", "Geeks", "for", "Geeks", 
				"GeeksforGeeks", "GFG");
		
		long total = list.stream().distinct().count();
		
		System.out.println(total);
	}

}
