package com.liambass.singleresponsibilityexercise;

import java.time.LocalDate;

public class Mechanic {

	private double bill = 0;

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public void changeOil(Car car) {
		car.setLastOilChange(LocalDate.now());
		bill += 50;
	}

	public void changeTyres(Car car) {
		car.setLastTyreChange(LocalDate.now());
		bill += 200;
	}

	public void addSpoiler(Car car) {
		if (car.getHasSpoiler() == false) {
			bill += 250;
		}
		car.setHasSpoiler(true);
	}

	public void removeSpoiler(Car car) {
		car.setHasSpoiler(false);
		if (car.getHasSpoiler() == true) {
			bill += 75;
		}
		
	}

}
