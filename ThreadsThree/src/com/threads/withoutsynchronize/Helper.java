package com.threads.withoutsynchronize;

public class Helper extends Thread {
	Range range;
	int low, high;
	
	Helper(Range rangeObj, int lowLimit, int highLimit) {
		range = rangeObj;
		low =lowLimit;
		high = highLimit;
	}

	public void run() {
		range.display(low, high);
	}
}
