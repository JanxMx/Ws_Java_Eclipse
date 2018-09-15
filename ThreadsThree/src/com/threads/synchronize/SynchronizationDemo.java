package com.threads.synchronize;

public class SynchronizationDemo {

	public static void main(String[] args) {
		// We create one object to print different ranges
		Range obj = new Range();
		
		// create a thread to print between 1 to 10
		Helper th1 = new Helper(obj, 1, 10);
		
		// create another thread to print between 51 to 60
		Helper th2 = new Helper(obj, 51, 60);
		
		th1.start();
		th2.start();
	}
}
