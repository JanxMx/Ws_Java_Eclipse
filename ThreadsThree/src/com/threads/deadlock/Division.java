package com.threads.deadlock;

public class Division {

	String str1 = "cse";	// resource 1
	String str2 = "geek";	// resource 2
	
	void div1() {	// computes str1 + str2
		synchronized(str1) {	// acquire a lock on str1
			System.out.println("Thread1: Acquired lock on str1");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				synchronized(str2) {	// acquire a lock on str2
					System.out.println("Thread1: Acquired lock on str2");
					String str = str1 + str2;
					System.out.println(str1 + "+" + str2 + " = " + str);
				}
			}
		}
	}
	
	void div2() {	// computes str2 + str1
		synchronized(str2) {	// acquire a lock on str2
			System.out.println("Thread2: Acquired lock on str2");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				synchronized(str1) {	// acquire a lock on str1
					System.out.println("Thread2: Acquired lock on str1");
					String str = str2 + str1;
					System.out.println(str2 + "+" + str1 + " = " + str);
				}
			}
		}
	}
	
}
