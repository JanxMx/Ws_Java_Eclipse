package com.threads.restaurant.multiplate.error;

import java.util.LinkedList;
import java.util.List;

public class Restaurant {
	
	final int NUMBER_PLATES = 4;	
	List<Plate> plates;
	int platesAvailable = NUMBER_PLATES;
	
	int numberChair = 6;
	List<Client> clients = new LinkedList<Client>();
	
	public Restaurant() {
		addPlates();
	}

	public void addPlates() {
		System.out.println("creating PlatesList...");

		plates = new LinkedList<Plate>();
		
		for(int i=0; i<NUMBER_PLATES; i++) {
			Plate plate = new Plate(i+1);
			plates.add(plate);
		}
	}
	
	public void addClient(Client client) {
		
		synchronized(clients) {
			if(clients.size() == numberChair) {
				System.out.println("No chair available, " + client.getName() + " leaves the restaurant.");
				client.setActiveFlag(false);
				return;
			}
			
			((LinkedList<Client>)clients).offer(client);
			System.out.println(client.getName() + " is ready for eat...");
		}
	}
	
	public void getPlate(Client client) {
		
		//System.out.println(client.getName() + " platesAvailable: " + platesAvailable);
	
		boolean waitFlag = true;
		while(waitFlag) {
			
			if(platesAvailable == 0) {
				try {
					//System.out.println(client.getName() + " is waiting plate...");
					client.wait(1000);
					waitFlag = true;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				//System.out.println(client.getName() + " must start to eat...");
				
				for(int i=0; i<3; i++) {
					//System.out.println(client.getName() + " plate " + i + " is " + plates.get(i).isAvailable());
					
					if(plates.get(i).isAvailable()) {
						decrementSync();
						if(plates.get(i).getPlate(client.getName())) {
							incrementSync();
							((LinkedList<Client>) clients).poll();
							System.out.println(client.getName() + " leaves the restaurant.");
							waitFlag = false;
							//notifyAll();
						}				
						break;
					}
				}			
			}			
		}
	}	
	
	synchronized void incrementSync() {
		platesAvailable++;
	}
	
	synchronized void decrementSync() {
		platesAvailable--;
	}
	
}
