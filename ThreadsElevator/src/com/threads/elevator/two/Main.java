package com.threads.elevator.two;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to MyLift");
		
		// RequestListenerThread to read requested floor and add to Set
		Thread requestListenerThread = new Thread(new RequestListener(), "RequestListenerThread");
		
		// RequestProcessorThread to read requested floor and add to Set
		Thread requestProcessorThread = new Thread(new RequestProcessor(), "RequestProcessorThread");
		
		Elevator.getInstance().setRequestProcessorThread(requestProcessorThread);
		
		requestListenerThread.start();
		requestProcessorThread.start();
	}
}
