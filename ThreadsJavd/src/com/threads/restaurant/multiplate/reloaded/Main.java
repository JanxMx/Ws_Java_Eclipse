package com.threads.restaurant.multiplate.reloaded;

/*
 * This is one exercise of concurrency 
 *		- N seats 		example:  5
 *		- N plate 		example:  3
 * 		- N clients 	example: 10
 * First the client should find one available seat in another case leave the restaurant
 * The plate available is delighted for one of the clients ready for eat, the rest must wait for another plate. 
 */
public class Main {

	public static void main(String[] args) {
		
		Restaurant restaurant = new Restaurant();
		
		ClientGenerator cg = new ClientGenerator(restaurant);
		Thread thCG = new Thread(cg);
		thCG.start();
		
		synchronized(thCG) {
			try {
				thCG.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Creation clients total time: " + cg.getTotalTime() );
		}
	}
}
