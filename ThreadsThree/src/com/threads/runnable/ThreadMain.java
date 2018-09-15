package com.threads.runnable;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		ThreadA obj_a = new ThreadA();
		ThreadB obj_b = new ThreadB();
		
		Thread thread_a = new Thread(obj_a);
		Thread thread_b = new Thread(obj_b);
		thread_a.start();
		thread_b.start();
	}

}
