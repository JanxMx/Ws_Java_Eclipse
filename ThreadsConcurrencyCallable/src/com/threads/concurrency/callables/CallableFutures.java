package com.threads.concurrency.callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutures {

	private static final int NTHREDS = 10;
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
		List<Future<Long>> list = new ArrayList<Future<Long>>();

		for(int i=0; i<20; i++) {
			
			// The Callable object use generics to define the type of object which is returned
			Callable<Long> worker = new MyCallable();
			
			// The Future object is used to check the status of a Callable
			Future<Long> submit = executor.submit(worker);
			try {
				// The get() method retrieve the result of the future 
				System.out.println("Submit:" + submit.get().toString());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
			list.add(submit);
		}
		
		long sum = 0;
		System.out.println(list.size());
		// now retrieve the result
		
		for(Future<Long> future: list) {
			try {
				sum += future.get();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}catch(ExecutionException e) {
				e.printStackTrace();
			}
		}
		//System.out.println(sum);
		System.out.println("Thread name:" + Thread.currentThread().getName() + " -total:" + sum);
		executor.shutdown();
	}
	
}
