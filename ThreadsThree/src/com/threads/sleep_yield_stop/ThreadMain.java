package com.threads.sleep_yield_stop;

public class ThreadMain {
	
	public static void main(String[] args) {
		new ThreadA().start();
		new ThreadB().start();
		new ThreadC().start();
	}

}
