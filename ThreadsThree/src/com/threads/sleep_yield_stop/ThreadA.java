package com.threads.sleep_yield_stop;

public class ThreadA extends Thread {
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Thread A... i = " + i);
			if(i==3) {
				try {
					sleep(800);		// sleep for 800 ms
				}catch(Exception e) {
					
				}
			}
		}
		System.out.println("Exit from Thread A: Execution over");
	}

}
