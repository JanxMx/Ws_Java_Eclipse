package com.threads.restaurant.multiplate.error;

import java.util.concurrent.TimeUnit;

public class ClientGenerator implements Runnable {

	public long initialTime = (long) System.currentTimeMillis();
	private Restaurant restaurant;
	private int num = 1; 
	private int threads = 0;
	
	public ClientGenerator(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	public void run() {
		
		while(threads<15) {
			threads++;
			
			Client client = new Client(restaurant, "Client " + num);
			Thread thClient = new Thread(client);
			thClient.start();
			long duration = (long) (Math.random() * 8);
			num++;
			try {
				TimeUnit.SECONDS.sleep(duration);
			}catch(InterruptedException iex) {
				iex.printStackTrace(); 
			}
			System.out.println("Client " + num + " creado en " + duration + " segundos.");
		}
		//System.out.println("Total Time 1: " + (System.currentTimeMillis() - initialTime) / 1000 + "seg." );
	}

	public String getTotalTime() {
		
		return (System.currentTimeMillis() - initialTime) / 1000 + "seg.";
	}

	
}
