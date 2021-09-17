package com.liambass.abstractionexercises;

public class Car implements Vehicle, Ecological{

	double topSpeed;
	String powerSource;
	
	
	public Car(double topSpeed, String powerSource) {
		super();
		this.topSpeed = topSpeed;
		this.powerSource = powerSource;
	}

	@Override
	public double topSpeed() {
		return topSpeed;
	}

	@Override
	public boolean wheeled() {
		return true;
	}

	@Override
	public String powerSource() {
		return powerSource;
	}

	@Override
	public String ecoFriendly() {
		return ((powerSource == "Electric")? "Electric cars are pretty eco friendly" : "Cars with an internal combustion engine are generally not eco friendly");
		
	}

}
