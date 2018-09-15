package com.threads.notifyandwait;

// different threads to compute sum and average
public class WaitNotifyDemo {
	
	public static void main(String[] args) {
		int arr[] = {56, 43, 12, 9, 39};
		SumAvg sa = new SumAvg(arr);
		
		// create different threads to compute sum and average
		SumHelper sh = new SumHelper(sa);	// this thread computes sum
		AvgHelper ah = new AvgHelper(sa);	// this thread computes average
		
		ah.start();
		sh.start();
	}

}
