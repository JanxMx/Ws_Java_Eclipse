package com.threads.concurrency.first;

public class ThreadAwithoutConcurrency {

	public static void main(String[] args) {
		ThreadBWC b = new ThreadBWC();
		b.start();
		
		System.out.println("Total is: " + b.total);
	}
}


class ThreadBWC extends Thread {
	int total;
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			total += i;
		}
		
		System.out.println("Run - Total is: " + total);
	}
}