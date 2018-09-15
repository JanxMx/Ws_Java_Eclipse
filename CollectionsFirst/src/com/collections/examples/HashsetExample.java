package com.collections.examples;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String args[]){
		  
		 HashSet<String> al=new HashSet();	// creating hashSet
		 al.add("Rachit");					// adding elements
		 al.add("Amit");
		 al.add("jack");
		 
		 Iterator<String> itr=al.iterator();
		 while(itr.hasNext()){
			 System.out.println(itr.next());
		 }
	}
}
