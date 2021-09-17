//- Design a class named Person and two subclasses named Banker and Farmer.
//- Every person should have some generic attributes (e.g. name, age) and functionality (e.g. eat, sleep).
//- The Banker and Farmer subclasses should also have attributes and functionality unique to them.
//- The two subclasses should have their own custom constructors to set any relevant values.
//- The two subclasses should also override a method from the Person class and implement it differently.
//- All three classes should override the toString() method in order to print some useful information about the class.
//- The Subclass toString() methods should include the same information as Person, but with their own unqiue info on top.
//- Use encapsulation - private class variables with getters & setters.
//- Use a separate runner class with a main method.

//- Read through community module on Polymorphism
//- Have a go at testing polymorphism on your classes from yesterday.
//- E.g. Create 3 instances of Farmer, stored as Object, Person and Farmer.
//- Experiment with method access and casting to access methods.

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
