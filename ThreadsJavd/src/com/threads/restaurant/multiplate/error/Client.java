package com.threads.restaurant.multiplate.error;

public class Client implements Runnable {

	private String name;
	private Restaurant restaurant;
	private boolean activeFlag;
	
	public Client(Restaurant restaurant, String name) {
		this.restaurant = restaurant;
		this.name = name;
		this.activeFlag = true;
	}
	
	@Override
	public void run() {
		getChair();
		
		if(activeFlag) {
			getPlate();
		}
	}
	
	private synchronized void getChair() {
		restaurant.addClient(this);
	}
	
	private synchronized void getPlate() {
		restaurant.getPlate(this);
	}
	
	public String getName() {
		return name;
	}

	public boolean isActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
	
}
