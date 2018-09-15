package com.threads.basic;

/*
 * Define a class A which inherits from class Thread
 * (create 1st thread)
 */
public class ThreadB extends Thread {
	
	public void run() {
		for(int i=11; i<=15; i++) {
			System.out.println("Thread B... i = " + i);
		}
		System.out.println("Exit from Thread B: Execution over");
	}
}
