package com.threads.notifyandwait;

// This is a helper class to compute the sum of all elements in the array
public class SumHelper extends Thread {

	SumAvg sa;
	SumHelper(SumAvg obj) {
		sa = obj;
	}
	
	public void run() {
		sa.sum();
	}
	
}
