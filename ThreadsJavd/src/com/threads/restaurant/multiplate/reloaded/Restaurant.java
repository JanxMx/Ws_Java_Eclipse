package com.threads.restaurant.multiplate.reloaded;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Restaurant {
	
	private final int NUMBER_OF_CHAIRS = 6;
	private final int NUMBER_OF_PLATES = 4;
	private static int platesAvailable = 4;
	private Semaphore platesSw;

	List<Plate> plates;
	List<Client> clients = new LinkedList<Client>();
	
	public Restaurant() {
		addPlates();
		platesSw = new Semaphore(1);
	}

	public void addPlates() {
		System.out.println("creating PlatesList...");

		plates = new LinkedList<Plate>();
		
		for(int i=0; i<NUMBER_OF_PLATES; i++) {
			Plate plate = new Plate(i+1);
			plates.add(plate);
		}
	}
	
	public boolean addClient(Client client) {
		
		synchronized(clients) {
			if(clients.size() == NUMBER_OF_CHAIRS) {
				System.out.println("There's not chairs available, " + client.getName() + " leaves the restaurant.");
				return false;
			}
			
			((LinkedList<Client>)clients).offer(client);
			System.out.println(client.getName() + " is ready for eat...");
			return true;
		}
	}
	
	public void getPlate(Client client) {
	
		boolean waitFlag = true;
		while(waitFlag) {
			
			if(platesAvailable == 0) {		// Waiting plate...
				try {
					client.wait(1000);
					waitFlag = true;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {		// Ready for eat...
				
				for(int i=0; i<NUMBER_OF_PLATES; i++) {

					//System.out.println(client.getName() + " plate " + i + " is " + plates.get(i).isAvailable());
					if(plates.get(i).isAvailable()) {
						
						// increment plates available
						incrementLock();
						if(plates.get(i).getPlate(client.getName())) {
							
							// reduce plates available
							--platesAvailable;
							((LinkedList<Client>) clients).poll();
							System.out.println(client.getName() + " leaves the restaurant.");
							waitFlag = false;
						}				
						break;
					}
				}			
			}			
		}
	}
	
	public void incrementLock() {
		try {
			// mutual exclusion for readerCount
			platesSw.acquire();
		}catch(InterruptedException e) {
			
		}
		platesAvailable++;
		
		// mutual exclusion for readerCount
		platesSw.release();
	}

}
