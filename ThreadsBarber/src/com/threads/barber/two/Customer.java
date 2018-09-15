package com.threads.barber.two;

import java.util.Date;

public class Customer implements Runnable {
	
	String name;
	Date inTime;
	Bshop shop;

	public Customer(Bshop shop) {
		this.shop = shop;
	}
	
	public void run() {
		goForHairCut();
	}
	
	private synchronized void goForHairCut() {
		shop.add(this);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getInTime() {
		return inTime;
	}
	
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

}
