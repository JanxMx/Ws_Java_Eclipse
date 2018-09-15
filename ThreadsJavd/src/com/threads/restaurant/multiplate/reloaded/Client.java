package com.threads.restaurant.multiplate.reloaded;

public class Client implements Runnable {

	private String name;
	private Restaurant restaurant;
	
	public Client(Restaurant restaurant, String name) {
		this.restaurant = restaurant;
		this.name = name;
	}
	
	@Override
	public void run() {
		boolean isReadyForEat = addClient();

		synchronized(this) {
			if(isReadyForEat) {
				getPlate();
			}
		}
	}
	
	private synchronized boolean addClient() {
		return restaurant.addClient(this);
	}
	
	private synchronized void getPlate() {
		restaurant.getPlate(this);
	}
	
	public String getName() {
		return name;
	}
	
}
