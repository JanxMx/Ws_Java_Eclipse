package com.collections.examples;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetExample {
	public static void main(String args[]){
		LinkedHashSet<String> al = new LinkedHashSet(); 	// creating linkedhashset
		al.add("Mariana");									// adding elements 
		al.add("Rick");
		al.add("Sam");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
