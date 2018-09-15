package com.factories.dog;

/*
 * A "driver" program to demostrate my "dog factory".
 * @author Alvin Alexander 
 */
public class MainFactory {

	public static void main(String[] args) {
		// create a small dog
		Dog dog = DogFactory.getDog("small");
		dog.speak();
		
		// create a big dog
		dog = DogFactory.getDog("big");
		dog.speak();

		// create a working dog
		dog = DogFactory.getDog("working");
		dog.speak();
	}
	
}
