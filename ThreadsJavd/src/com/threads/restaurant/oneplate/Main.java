package com.threads.restaurant.oneplate;

/*
 * This is one exercise of concurrency 
 *		- 5  seats
 *		- 1  plate 
 * 		- 10 clients
 * First the client should find one available seat in another case leave the restaurant
 * The plate available is delighted for one of the clients ready for eat, the rest must wait for another plate. 
 */
public class Main {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		
		ClientGenerator cg = new ClientGenerator(restaurant);
		Thread thCG = new Thread(cg);
		thCG.start();
		
	}
}
