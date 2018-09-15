package com.threads.first;

public class FirstThread extends Thread {
	
	private int counter = 500;
	
	public void run() {
		
		//*** Execution state
		while(counter<508) {
			System.out.println("FirstThread - counter: FT_" + counter++);
		
			try {
				Thread.sleep(5000);
			}catch(InterruptedException iex) {
				iex.printStackTrace();
			}
		}
		
		//*** Dead state
	}

}
