package com.threads.first;

public class FirstMain {
	
	public static void main(String[] args) {

		System.out.println("------------ 1- Testing Thread --------------- ");
		System.out.println("------ creation, execution and dead ---------- ");
		//*** Creation state
		FirstThread firstThread = new FirstThread();
		
		//*** Ready state
		firstThread.start();

		
		System.out.println("---------- 2- Testing Runnable --------------- ");
		System.out.println("------ creation, execution and dead ---------- ");
		//*** Creation state
		FirstRunnable firstRunnable = new FirstRunnable();
		
		//*** Ready state
		Thread thread = new Thread(firstRunnable);
		thread.start();
		
		/* ** Pitfall - Calling Run() instead of start()
		  thread.run();		// should be start()
		 */
		
	}

}
