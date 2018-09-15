package com.threads.restaurant.oneplate;

import java.util.concurrent.TimeUnit;

public class Plate {

	private int id; 
	
	public Plate(int id) {
		this.id = id;
		System.out.println("The plate " + id + " is available.");
	}
	
	public boolean getPlate(String clientName) {
		
		System.out.println(clientName + " is starting to eat...");
		
		long duration = (long)(Math.random()*20);
		try {
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(clientName + " finish in " + duration + " seconds.");
		return true;
	}

	public int getId() {
		return id;
	}

}
