package com.threads.restaurant.multiplate.reloaded;

import java.util.concurrent.TimeUnit;

public class ClientGenerator implements Runnable {

	private final int TIME_CREATION = 4;
	private final int MAX_CLIENTS = 25;
	private boolean  ignoreMaxClients = true;
	
	private long initialTime = (long) System.currentTimeMillis();
	private Restaurant restaurant;
	private int num = 1; 
	private int threads = 0;
	
	public ClientGenerator(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	public void run() {
		
		while(ignoreMaxClients || threads < MAX_CLIENTS) {
			threads++;
			
			Client client = new Client(restaurant, "Client " + num);
			Thread thClient = new Thread(client);
			thClient.start();
			
			long duration = 0;
			while(duration==0) {
				duration = (long) (Math.random() * TIME_CREATION);
			}
			num++;
			try {
				TimeUnit.SECONDS.sleep(duration);
			}catch(InterruptedException iex) {
				iex.printStackTrace(); 
			}
			
			if(ignoreMaxClients || num < MAX_CLIENTS+1) {
				System.out.println("Client " + num + " creado en " + duration + " segundos.");
			}
		}
		//System.out.println("Total Time 1: " + (System.currentTimeMillis() - initialTime) / 1000 + "seg." );
	}

	public String getTotalTime() {
		
		return (System.currentTimeMillis() - initialTime) / 1000 + "seg.";
	}

	
}
