package com.threads.sleep_yield_stop;

public class ThreadB extends Thread {
	
	public void run() {
		for(int i=11; i<=15; i++) {
			System.out.println("Thread B... i = " + i);
			if(i==12) {
				yield();		// relinquish control to some other thread
			}
		}
		System.out.println("Exit from Thread B: Execution over");
	}
}
