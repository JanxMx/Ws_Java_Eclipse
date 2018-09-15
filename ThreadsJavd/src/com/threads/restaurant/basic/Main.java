package com.threads.restaurant.basic;

public class Main {

	public static void main(String a[]) {
		Fork fork = new Fork();
		
		Client clientA = new Client(fork);
		clientA.setName("Client A");
		
		Client clientB = new Client(fork);
		clientB.setName("Client B");
		
		//CustomerGenerator cg = new CustomerGenerator(shop);
		
		Thread thClientA = new Thread(clientA);
		Thread thClientB = new Thread(clientB);
		//Thread thcg = new Thread(cg);
		//thcg.start();
		thClientA.start();
		thClientB.start();
	}
	
}
