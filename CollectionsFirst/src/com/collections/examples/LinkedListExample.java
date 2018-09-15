package com.collections.examples;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String args[]){
		LinkedList<String> al=new LinkedList<String>(); // creating linked list
		al.add("Rachit");                               // adding elements
		al.add("Rahul");
		al.add("Rajat");
		al.add("Diju");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
