package com.threads.semaphores.rdwr;

/*
 * This class represents a reader to the database.
 */

public class Reader implements  Runnable {
	
	private RWLock database;
	private int readerNum;
	
	public Reader(int readerNum, RWLock database) {
		this.readerNum = readerNum;
		this.database = database;
	}
	
	@Override
	public void run() {
		while(true) {
			SleepUtilities.nap();
			
			System.out.println("reader " + readerNum + " wants to read.");
			database.acquireReadLock(readerNum);
			
			/*
			 * you have access to read from the database
			 * let´s read for a while...
			 */
			SleepUtilities.nap();
			database.releaseReadLock(readerNum);
		}
	}

}
