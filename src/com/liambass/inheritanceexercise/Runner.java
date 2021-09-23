package com.liambass.inheritanceexercise;

public class Runner {

	public static void main(String[] args) {
		Person bob = new Person("Bob", 43);
		Banker rupert = new Banker("Rupert", 25, 95452155);
		
		Farmer giles = new Farmer("Giles", 55, "Cow", "Corn");
		Person mcDonald = new Farmer("McDonald", 52, "Alpaca", "Wheat");
		Object wayne = new Farmer("Wayne", 30, "Dog", "Apples");
		
		rupert.setWealth(99152567);
		System.out.println(bob.sleep()); 
		System.out.println(giles.sleep());
		
		System.out.println(bob);
		System.out.println(giles);
		System.out.println(rupert);
		
		System.out.println(giles.eggs(15));
		System.out.println(((Farmer)mcDonald).eggs(15));
		System.out.println(((Person)wayne).sleep());
		
	}

}
