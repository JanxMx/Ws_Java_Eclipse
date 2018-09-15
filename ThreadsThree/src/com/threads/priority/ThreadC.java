package com.threads.priority;

public class ThreadC extends Thread {
	
	public void run() {
		
		System.out.println("Thread C priority: " + this.getPriority());
		
		for(int i=21; i<=25; i++) {
			System.out.println("Thread C... i = " + i);
		}
		System.out.println("Exit from Thread C: Execution over");
	}
}
