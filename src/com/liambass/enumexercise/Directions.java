package com.liambass.enumexercise;

public enum Directions {
	NORTH("Forward", "N"), 
	EAST("Right", "E"), 
	SOUTH("Backwards", "S"), 
	WEST("Left", "W");

	private final String motion;
	private final String abrev;

	Directions(String motion, String abrev) {
		this.motion = motion;
		this.abrev = abrev;
	}

	public String move() {
		return abrev + " is the same as moving " + motion + ".";
	}

}
