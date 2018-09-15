package com.threads.restaurant.multiplate.reloaded;

import java.util.concurrent.TimeUnit;

public class Plate {

	private final int EAT_TIME = 25;
	private int id;
	private boolean available;
	
	public Plate(int id) {
		this.id = id;
		System.out.println("The plate " + id + " is available.");
		available = true;
	}
	
	public synchronized boolean getPlate(String clientName) {
		
		available = false;
		System.out.println(clientName + " starting to eat on plate " + id);

		long duration = (long)(Math.random() * EAT_TIME);
		try {
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(clientName + " finish in " + duration + " seconds.");
		System.out.println("Plate " + id + " is available");
		available = true;
		
		return true;
	}

	public int getId() {
		return id;
	}

	public boolean isAvailable() {
		return available;
	}

}
