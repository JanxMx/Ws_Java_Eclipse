package com.abstracts.animal.vertebrados.mamiferos;

import com.abstracts.animal.interfaces.Cazar;
import com.abstracts.animal.vertebrados.Mamifero;

public class Coyote extends Mamifero implements Cazar {

	public Coyote() {
		super("Coyote");
	}
	
	@Override
	public void addFood() {

		String[] food = {"conejos", "ardillas", "ratones", "pajaros", "otros"};
		this.setFood(food);
	}	
	
	@Override
	public String[] eat() {

		return this.getFood();
	}
	
	@Override
	public void describeCaza() {
		
		System.out.println("caza:         El coyote caza en manada: conejos, ratones, musarañas y pequeños insectos.");
	}
	
}
