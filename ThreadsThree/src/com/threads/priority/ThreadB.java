package com.threads.priority;

public class ThreadB extends Thread {
	
	public void run() {
		
		System.out.println("Thread B priority: " + this.getPriority());
		
		for(int i=11; i<=15; i++) {
			System.out.println("Thread B... i = " + i);
		}
		System.out.println("Exit from Thread B: Execution over");
	}
}
