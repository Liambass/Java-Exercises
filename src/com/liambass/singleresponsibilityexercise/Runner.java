package com.liambass.singleresponsibilityexercise;

public class Runner {
	public static void main(String[] args) {
		
		Car ford = new Car("Red", "Focus", 103040, null, null, false);
		Driver driver = new Driver();
		Mechanic mechanic = new Mechanic();
		
		System.out.println(ford);
		
		driver.drive(ford, 125);
		
		System.out.println(ford);
		
		mechanic.addSpoiler(ford);
		
		System.out.println(ford);
		
		driver.drive(ford, 5000);
		
		mechanic.changeTyres(ford);
		driver.changeOil(ford);
		
		System.out.println(ford);
		
		System.out.println("You have driven " + driver.getMilesDriven() + " miles.");
		
		System.out.println("You owe your mechanic £" + mechanic.getBill() + ".");
	
	}
}
