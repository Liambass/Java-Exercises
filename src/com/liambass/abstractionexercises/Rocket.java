package com.liambass.abstractionexercises;

public class Rocket implements Vehicle{

	@Override
	public double topSpeed() {
		return 10000;
	}

	@Override
	public boolean wheeled() {
		return false;
	}

	@Override
	public String powerSource() {
		return "Rocket fuel!";
	}

}
