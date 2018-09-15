package com.collections.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	 public static void main(String args[]){
		  
		 List al = new ArrayList();		// creating array list
		 al.add("Jack");                // adding elements    
		 al.add("Tyler");
		 al.add("John");
		 al.add("Abraham");
		 
		 System.out.println("------- iterator -------");
		 Iterator itr = al.iterator();
		 while(itr.hasNext()){
			 System.out.println(itr.next());
		 }
		 
		 System.out.println("--------- loop ---------");
		 for(Object obj: al) {
			 System.out.println((String)obj);
		 }
	 }
}
