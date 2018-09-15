package com.threads.sleep_yield_stop;

public class ThreadC extends Thread {
	
	public void run() {
		for(int i=21; i<=25; i++) {
			System.out.println("Thread C... i = " + i);
			if(i==3) {
				stop();		// thread exceution stops
			}
		}
		System.out.println("Exit from Thread B: Execution over");
	}
}
