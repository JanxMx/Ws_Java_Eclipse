package com.threads.priority;

public class ThreadA extends Thread {
	
	public void run() {
		
		System.out.println("Thread A priority: " + this.getPriority());
		
		for(int i=1; i<=5; i++) {
			System.out.println("Thread A... i = " + i);
		}
		System.out.println("Exit from Thread A: Execution over");
	}

}
