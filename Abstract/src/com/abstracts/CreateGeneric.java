package com.abstracts;

import java.util.Arrays;

import com.abstracts.animal.Animal;
import com.abstracts.animal.interfaces.Cazar;

public class CreateGeneric<T extends Animal> {
	
	public CreateGeneric() {

	}

	public Animal createAnimal(Class<T> clazz) {

		Animal animal = null;
		try {
			animal = (Animal) clazz.newInstance();
			
			System.out.println("---------------------------------------");
			System.out.println("tipo:         " + animal.getType());
			System.out.println("1st Subgroup: " + animal.getFirstSubGroup());
			System.out.println("2nd Subgroup: " + animal.getSecondSubGroup());
			System.out.println("eat:          " + Arrays.toString(animal.eat()));
			
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return animal;
	};
	
	public Animal createAnimal2(Class<T> clazz) {

		Animal animal = null;
		try {
			animal = (Animal) clazz.newInstance();
			
			System.out.println("---------------------------------------");
			System.out.println("tipo:         " + animal.getType());
			System.out.println("1st Subgroup: " + animal.getFirstSubGroup());
			System.out.println("2nd Subgroup: " + animal.getSecondSubGroup());
			System.out.println("eat:          " + Arrays.toString(animal.eat()));
			
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return animal;
	};

}

/*
public static <T> T instanceOf (Class<T> clazz) throws Exception {
	return clazz.newInstance();
}
 */