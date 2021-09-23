package com.liambass.singleresponsibilityexercise;

import java.time.LocalDate;

public class Driver {
	
	
    private int milesDriven;

    public int getMilesDriven() {
		return milesDriven;
	}

	public void setMilesDriven(int milesDriven) {
		this.milesDriven = milesDriven;
	}

	// functionality
    public void drive(Car car, int milesDriven){
        this.milesDriven += milesDriven;
        car.setMileage(car.getMileage() + milesDriven);
    }
    
    public void changeOil(Car car) {
    	car.setLastOilChange(LocalDate.now());
    }
}