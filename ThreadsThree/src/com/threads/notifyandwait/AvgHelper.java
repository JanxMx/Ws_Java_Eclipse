package com.threads.notifyandwait;

// This is a helper class to compute the average of all numbers
public class AvgHelper extends Thread {

	SumAvg sa;
	AvgHelper(SumAvg obj) {
		sa = obj;
	}
	
	public void run() {
		sa.average();
	}
	
}
