package com.threads.concurrency.first;

public class ThreadA {

	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized(b) {
			System.out.println("Waiting for b to complete 1...");
			try {
				System.out.println("Waiting for b to complete 2...");
				b.wait();
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Total is: " + b.total);
		}
	}
}


class ThreadB extends Thread {
	int total;
	
	@Override
	public void run() {
		
		//*** Synchronized Block for Instance Methods
		//*** This is called "Monitor Object"
		synchronized(this) {
			for(int i=0; i<100; i++) {
				total += i;
			}
			notify();
		}
	}

	/*
	 * Both methods working good
	 * synchronizing Method or Block
	 *
	//*** Synchronized Method
	@Override
	public synchronized void run() {
		for(int i=0; i<100; i++) {
			total += i;
		}
		notify();
	}*/
	
}