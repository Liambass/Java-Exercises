package com.liambass.inheritanceexercise;

public class Banker extends Person{
	
	private int wealth;

	public Banker(String name, int age, int wealth) {
		super(name, age);
		this.wealth = wealth;
	}

	public int getWealth() {
		return wealth;
	}

	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	
	@Override
	public String bestThing() {
		return "MONEY!!";
	}

	@Override
	public String toString() {
		return this.getName() + " is a " + this.getAge() + " year old banker. The thing they care about more than anything else in the world is " + bestThing();
	}
}
