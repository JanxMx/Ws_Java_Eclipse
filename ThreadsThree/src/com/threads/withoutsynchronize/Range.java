package com.threads.withoutsynchronize;

/*
 * Method is not synchronized
 * context switch can ocurr an any point within the method body.
 * More than one thread can be inside the method at any point
 */
public class Range {
	void display(int low, int high) {
		System.out.println("Display between " + low + " and " + high);
		for(int i=low; i<=high; i++) {
			System.out.println(i + " ");
		}
		System.out.println("Thread " + Thread.currentThread().getName() + " is over.");
	}
}
