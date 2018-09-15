package com.abstracts.animal.vertebrados.mamiferos;

import com.abstracts.animal.interfaces.Cazar;
import com.abstracts.animal.vertebrados.Mamifero;

public class Perro extends Mamifero implements Cazar {

	public Perro() {
		super("Perro");
	}
	
	@Override
	public void addFood() {

		String[] food = {"croquetas", "carne", "sobras caceras"};
		this.setFood(food);
	}	
	
	@Override
	public String[] eat() {

		return this.getFood();
	}

	@Override
	public void describeCaza() {
		
		System.out.println("caza:         Esto solo aplica para los perros de caza");
	}
	
}
