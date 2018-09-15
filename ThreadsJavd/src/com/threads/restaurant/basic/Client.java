package com.threads.restaurant.basic;

public class Client implements Runnable {

	String name;
	Fork fork;
	
	public Client(Fork fork) {
		this.fork = fork;
	}
	
	@Override
	public void run() {
		getFork();
	}

	private synchronized void getFork() {
		fork.getFork(this);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
