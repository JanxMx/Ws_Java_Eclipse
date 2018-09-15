package com.abstracts.animal.vertebrados.mamiferos;

import com.abstracts.animal.interfaces.Cazar;
import com.abstracts.animal.vertebrados.Mamifero;

public class Gato extends Mamifero implements Cazar {

	public Gato() {
		super("Gato");
	}
	
	@Override
	public void addFood() {

		String[] food = {"leche", "croquetas", "atun", "otros"};
		this.setFood(food);
	}	
	
	@Override
	public String[] eat() {

		return this.getFood();
	}

	@Override
	public void describeCaza() {
		
		System.out.println("caza:         El gato es un cazador innato, caza cualquier cosa que se mueva solo por instinto.");
	}
	
}
