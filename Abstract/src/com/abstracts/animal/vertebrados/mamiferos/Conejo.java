package com.abstracts.animal.vertebrados.mamiferos;

import com.abstracts.animal.vertebrados.Mamifero;

public class Conejo extends Mamifero {

	public Conejo() {
		super("Conejo");
	}
	
	@Override
	public void addFood() {

		String[] food = {"zanahoria", "lechuga", "coliflor", "espinaca", "brócoli", "manzana", "otros"};
		this.setFood(food);
	}	
	
	@Override
	public String[] eat() {

		return this.getFood();
	}
	
}
