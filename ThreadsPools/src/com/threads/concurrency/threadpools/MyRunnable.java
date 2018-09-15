package com.threads.concurrency.threadpools;

/**
 * MyRunnable will count the sum of the number from 1 to the parameter
 * countUntil and then write the result to the console.
 * <p>
 * MyRunnable is the task wich will be performed
 * 
 * @author Lars Vogel
 *
 */

public class MyRunnable implements Runnable {

	private long countUntil;
	
	MyRunnable(long countUntil) {
		this.countUntil = countUntil;
	}
	
	@Override
	public void run() {
		long sum = 0;
		for(long i=1; i<countUntil; i++) {
			sum += i;
			//System.out.println("Thread name:" + Thread.currentThread().getName() + " -sum:" + sum);
		}
		System.out.println("Thread name:" + Thread.currentThread().getName() + " -total:" + sum);
	}

}
