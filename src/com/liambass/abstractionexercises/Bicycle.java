package com.liambass.abstractionexercises;

public class Bicycle implements Vehicle, Ecological{

	
	String powerSource;
	
	public Bicycle(String powerSource) {
		super();
		this.powerSource = powerSource;
	}

	@Override
	public double topSpeed() {
		return 90;
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
		return "Bikes are very eco friendly";
	}
	

}
