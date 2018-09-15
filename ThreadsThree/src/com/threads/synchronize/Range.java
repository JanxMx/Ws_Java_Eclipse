package com.threads.synchronize;

/*
 * Method body of display() is a critical section and only one thread
 * can be inside synchronized method. Other thread can enter this method
 * only when first thread is done with its task.
 */
public class Range {
	
	synchronized void display(int low, int high) {
		System.out.println("Display between " + low + " and " + high);
		for(int i=low; i<=high; i++) {
			System.out.println(i + " ");
		}
		System.out.println("Thread " + Thread.currentThread().getName() + " is over.");
	}
}
