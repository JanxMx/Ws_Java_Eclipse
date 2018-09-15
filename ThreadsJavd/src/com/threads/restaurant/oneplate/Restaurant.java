package com.threads.restaurant.oneplate;

import java.util.LinkedList;
import java.util.List;

public class Restaurant {
	
	Plate plate;
	int numberChair;
	List<Client> clients;
	
	public Restaurant() {
		numberChair = 5;
		plate = new Plate(1);
		
		clients = new LinkedList<Client>();
	}
	
	public void addClient(Client client) {
		
		synchronized(clients) {
			if(clients.size() == numberChair) {
				System.out.println("No chair available, " + client.getName() + " leaves the restaurant.");
				client.setActiveFlag(false);
				return;
			}
			
			((LinkedList<Client>)clients).offer(client);
			System.out.println(client.getName() + " got the chair.");
		}
	}	
	
	
	public void getPlate(Client client) {
		System.out.println(client.getName() + " is waiting plate...");
		
		synchronized(this) {

			if(plate.getPlate(client.getName())) {
				((LinkedList<Client>) clients).poll();
				System.out.println(client.getName() + " leaves the restaurant.");
			}
		}
	}	
	
}
