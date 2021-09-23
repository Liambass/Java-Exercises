package com.liambass.singleresponsibilityexercise;

import java.time.LocalDate;

public class Car {
	private String colour;
	private String model;
	private int mileage;
	private LocalDate lastOilChange;
	private LocalDate lastTyreChange;
	private boolean hasSpoiler = false;
	
	
	public Car(String colour, String model, int mileage) {
		this.colour = colour;
		this.model = model;
		this.mileage = mileage;
	}

	public Car(String colour, String model, int mileage, LocalDate lastOilChange, 
			LocalDate lastTyreChange, boolean hasSpoiler) {
		this.colour = colour;
		this.model = model;
		this.mileage = mileage;
		this.lastOilChange = lastOilChange;
		this.lastTyreChange = lastTyreChange;
		this.hasSpoiler = hasSpoiler;
	}

	public LocalDate getLastTyreChange() {
		return lastTyreChange;
	}

	public void setLastTyreChange(LocalDate lastTyreChange) {
		this.lastTyreChange = lastTyreChange;
	}

	

	public boolean getHasSpoiler() {
		return hasSpoiler;
	}

	public void setHasSpoiler(boolean hasSpoiler) {
		this.hasSpoiler = hasSpoiler;
	}

	public LocalDate getLastOilChange() {
		return lastOilChange;
	}

	public void setLastOilChange(LocalDate lastOilChange) {
		this.lastOilChange = lastOilChange;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Your " + colour + " " + model + " has done " + mileage + " miles. \n" + 
			((lastOilChange == null)? "It has never had an oil change. " : 
			"It's oil was last changed " + lastOilChange + ".") + "\n" +
			((lastTyreChange == null)? "It has never had an tyre change. " : 
			"It's tyres were last changed " + lastOilChange + ".") + "\n" +
			((hasSpoiler == true)? "It has a spoiler. " : "It does not have a spoiler. ") + "\n";
								
	}
	
	

}