package com.threads.basic;

public class ThreadMain {
	
	public static void main(String[] args) {
		ThreadA thread_a = new ThreadA();
		ThreadB thread_b = new ThreadB();
		thread_a.start();
		thread_b.start();
	}

}
