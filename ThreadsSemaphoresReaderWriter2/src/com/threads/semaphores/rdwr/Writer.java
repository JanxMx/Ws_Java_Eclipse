package com.threads.semaphores.rdwr;

/*
 * This class represent a Writer.
 */

public class Writer extends Thread {
	
	private static int writers = 0;		// numbers of writers
	private int number;
	private Database database;
	
	/**
	 * Creates a writer for the specified database
	 * @param database database to which to write
	 */
	public Writer(Database database) {
		this.database = database;
		this.number = Writer.writers++;
	}
	
	
	public void run() {
		while(true) {
			final int DELAY = 5000;
			try {
				Thread.sleep((int) (Math.random() * DELAY));
			}catch(InterruptedException e) {
				
			}
			this.database.write(this.number);
		}
	}
	
}
