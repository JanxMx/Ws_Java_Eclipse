package com.threads.runnable;

/*
 * Define a class A which implements 'Runnable' interface
 * (create 1st thread)
 */
public class ThreadB implements Runnable {
	
	public void run() {
		for(int i=6; i<=10; i++) {
			System.out.println("Thread B... i = " + i);
		}
		System.out.println("Exit from Thread B: Execution over");
	}
}
