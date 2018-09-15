package com.threads.synchronizeds;

public class MainExample2 {
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		Counter counterB = new Counter();
		Thread threadA = new CounterThread(counter);
		Thread threadB = new CounterThread(counterB);
		
		threadA.start();
		threadB.start();
	}

}
