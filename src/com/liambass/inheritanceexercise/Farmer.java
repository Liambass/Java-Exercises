package com.liambass.inheritanceexercise;

public class Farmer extends Person {

	private String favAnimal;
	private String favCrop;
	private int eggs;
	
	
	public Farmer(String name, int age, String favAnimal, String favCrop) {
		super(name, age);
		this.favAnimal = favAnimal;
		this.favCrop = favCrop;
	}


	public String getFavAnimal() {
		return favAnimal;
	}


	public void setFavAnimal(String favAnimal) {
		this.favAnimal = favAnimal;
	}


	public String getFavCrop() {
		return favCrop;
	}


	public void setFavCrop(String favCrop) {
		this.favCrop = favCrop;
	}

	@Override
	public String sleep() {
		return "Cock-a-doodle-doo!";
	}
	
	@Override
	public String bestThing() {
		return "Cows!";
	}
	
	public String eggs(int i) {
		eggs += i;
		return this.getName() + " collected " + i + " eggs.";
	}


	@Override
	public String toString() {
		return this.getName() + " is a " + this.getAge() + " year old farmer whose favourite thing is " + bestThing();
	}
}
