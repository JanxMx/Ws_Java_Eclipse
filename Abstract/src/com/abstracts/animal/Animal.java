package com.abstracts.animal;

public abstract class Animal {
	
	private String firstSubGroup;
	private String secondSubGroup;
	private String type;

	private String[] food;
	
	public Animal(String firstSubGroup, String secondSubGroup, String type) {
		this.firstSubGroup = firstSubGroup;
		this.secondSubGroup = secondSubGroup;
		this.type = type;
		addFood();
	}
	
	public abstract void addFood();
	public abstract String[] eat();

	public String getFirstSubGroup() {
		return firstSubGroup;
	}

	public String getSecondSubGroup() {
		return secondSubGroup;
	}
	
	public String getType() {
		return type;
	}

	public String[] getFood() {
		return food;
	}

	public void setFood(String[] food) {
		this.food = food;
	}

}
