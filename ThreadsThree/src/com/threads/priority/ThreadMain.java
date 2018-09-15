package com.threads.priority;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		ThreadC threadC = new ThreadC();
		
		threadA.setPriority(Thread.MIN_PRIORITY);
		threadC.setPriority(Thread.MAX_PRIORITY);
		
		threadA.start();
		threadB.start();
		threadC.start();
	}

}
