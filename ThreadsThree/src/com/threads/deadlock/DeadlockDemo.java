package com.threads.deadlock;

public class DeadlockDemo {

	public static void main(String[] args) {

		final Division dv = new Division();
		
		// instantiate a Thread object to call div1() method
		Thread dh1 = new Thread() {
			public void run() {
				dv.div1();
			}
		};
		
		// instantiate another Thread object to call div2() method
		Thread dh2 = new Thread() {
			public void run() {
				dv.div2();
			}
		};
		
		dh1.start();
		dh2.start();
	}
}
