package com.threads.dinnigphilosophers;

public class DinningPhilosophers {
	
	public static void main(String[] args) throws Exception {
		
		final Philosopher[] philosophers = new Philosopher[5];
		Object[] forks = new Object[philosophers.length];

		System.out.println("length:" + philosophers.length);
		System.out.println("mod 1:" + 1%5);
		System.out.println("mod 2:" + 2%5);
		System.out.println("mod 3:" + 3%5);
		System.out.println("mod 4:" + 4%5);
		System.out.println("mod 5:" + 5%5);
		
		for(int i=0; i<forks.length; i++) {
			forks[i] = new Object();
		}
		
		for(int i=0; i<philosophers.length; i++) {
			Object leftFork = forks[i];
			Object rightFork = forks[(i+1) % forks.length];
						
			// the if is necessary to avoid deadlock
			if(i== philosophers.length -1) {
				// The last philosopher picks up the right fork first
				philosophers[i] = new Philosopher(rightFork, leftFork);
			}else {
				philosophers[i] = new Philosopher(leftFork, rightFork);
			}
			
			Thread t = new Thread(philosophers[i], "Philosopher " + (i+1));
			t.start();
		}
	}
}
