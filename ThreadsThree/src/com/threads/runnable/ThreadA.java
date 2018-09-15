package com.threads.runnable;

/*
 * Define a class A which implements 'Runnable' interface
 * (create 1st thread)
 */
public class ThreadA implements Runnable {
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Thread A... i = " + i);
		}
		System.out.println("Exit from Thread A: Execution over");
	}

}
