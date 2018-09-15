package com.threads.restaurant.basic;

import java.util.concurrent.TimeUnit;

public class Fork {

	//int count = 0;
	
	public synchronized void getFork(Client client) {
		//this.count += value;
		
		long duration=0;
		duration = (long)(Math.random()*10);
		try {
			System.out.println(Thread.currentThread().getName() + " - client " + client.getName() + " is starting to eat...");
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " finish in " + duration + " seconds.");
		/*
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			synchronized(str1) {	// acquire a lock on str1
				System.out.println("Thread2: Acquired lock on str1");
				String str = str2 + str1;
				System.out.println(str2 + "+" + str1 + " = " + str);
			}
		}*/		
		
	}
	
}
