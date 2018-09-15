package com.threads.semaphores.rdwr;

/*
 * This class represent a Writer to the database.
 */

public class Writer implements Runnable {
	
	private RWLock database;
	private int writerNum;
	
	public Writer(int writerNum, RWLock database) {
		this.writerNum = writerNum;
		this.database = database;
	}

	@Override
	public void run() {
		while(true) {
			SleepUtilities.nap();
			
			System.out.println("writer " + writerNum + " wants to write.");
			database.acquireWriteLock(writerNum);
			
			/*
			 * you have access to write to the database
			 * write for awhile
			 */
			SleepUtilities.nap();
			database.releaseWriteLock(writerNum);
		}
	}
	
}
