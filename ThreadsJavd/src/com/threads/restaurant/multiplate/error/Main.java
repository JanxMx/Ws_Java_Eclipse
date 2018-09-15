package com.threads.restaurant.multiplate.error;

/*
 * This is one exercise of concurrency 
 *		- 5  seats
 *		- 2  plate 
 * 		- 10 clients
 * First the client should find one available seat in another case leave the restaurant
 * The plate available is delighted for one of the clients ready for eat, the rest must wait for another plate. 
 * 
 * IMPORTANT ERROR FOUND!!!!! 
 * sometimes more than one thread (client) takes the same plate 
 * please review the realoaded version (fixed)
 */
public class Main {

	public static void main(String[] args) {
		
		//long initialTime = (long) System.currentTimeMillis();
		
		Restaurant restaurant = new Restaurant();
		
		ClientGenerator cg = new ClientGenerator(restaurant);
		Thread thCG = new Thread(cg);
		thCG.start();
		
		synchronized(thCG) {
			System.out.println("Waiting ClientGenerator Thread...");
			try {
				thCG.wait();
				System.out.println("Continuing ClientGenerator Thread ...");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Creation clients total time: " + cg.getTotalTime() );
		}
	}
}
