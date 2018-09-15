package com.threads.restaurant.oneplate;

import java.util.concurrent.TimeUnit;

public class ClientGenerator implements Runnable {

	private Restaurant restaurant;
	private int num = 1; 
	private int threads = 0; 
	
	public ClientGenerator(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	public void run() {
		
		while(threads<10) {
			threads++;
			
			Client client = new Client(restaurant, "Client " + num);
			Thread thClient = new Thread(client);
			thClient.start();
			num++;
			
			try {
				TimeUnit.SECONDS.sleep((long) (Math.random() * 8));
			}catch(InterruptedException iex) {
				iex.printStackTrace(); 
			}
		}
	}
}
