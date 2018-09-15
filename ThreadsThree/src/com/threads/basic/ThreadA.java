package com.threads.basic;

/*
 * Define a class A which inherits from class Thread
 * (create 1st thread)
 */
public class ThreadA extends Thread {
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Thread A... i = " + i);
		}
		System.out.println("Exit from Thread A: Execution over");
	}

}
