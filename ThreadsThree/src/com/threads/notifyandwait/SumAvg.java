package com.threads.notifyandwait;

// This class computes sum and average of a given set of no.s
public class SumAvg {
	
	int set[];
	int sum = 0;
	boolean sum_computed = false;
	
	SumAvg(int arr[]) {
		set = arr;
	}
	
	void sum() {
		// lock the next block
		synchronized(this) {
			try {
				System.out.println("Entered sum() method");
				for(int i=0; i<set.length; i++) {
					sum += set[i];
				}
				sum_computed = true;
				System.out.println("Sum has been computed = " + sum_computed);
				System.out.println("sum = " + sum);
				notify();	// notify the waiting thread that sum has been computed
			}catch(Exception e) {
			
			}
		}
	}

	void average() {
		synchronized(this) {
			// acquire a lock on the next object
			try {
				System.out.println("Entered average() method");
				while(!sum_computed) {
					System.out.println("Waiting for sum to be computed ");
					wait();	// call to wait() method releases the acquired locks
					System.out.println("Sum has been computed");
				}
				float avg = (float)sum/set.length;
				System.out.println("Avg = " + avg);
			}catch(Exception e) {
				
			}
		}
	}
}
