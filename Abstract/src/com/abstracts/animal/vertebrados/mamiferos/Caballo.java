package com.abstracts.animal.vertebrados.mamiferos;

import com.abstracts.animal.vertebrados.Mamifero;

public class Caballo extends Mamifero {

	public Caballo() {
		super("Caballo");
	}
	
	@Override
	public void addFood() {

		String[] food = {"hierba", "forraje", "heno", "paja"};
		this.setFood(food);
	}	
	
	@Override
	public String[] eat() {

		return this.getFood();
	}
	
}
