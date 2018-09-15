package com.abstracts.animal.vertebrados.mamiferos;

import com.abstracts.animal.vertebrados.Mamifero;

public class Ardilla extends Mamifero {

	public Ardilla() {
		super("Ardilla");
	}

	@Override
	public void addFood() {

		String[] food = {"hierbas", "frutas", "semillas"};
		this.setFood(food);
	}	
	
	@Override
	public String[] eat() {

		return this.getFood();
	}

}
