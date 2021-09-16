package com.liambass.constructorexercise;

public class Runner {

	public static void main(String[] args) {
		Person liam = new Person("Liam", 33, 203, 14, "QA trainee");
		Person arthur = new Person("Arthur Dent", 40);
		Person ford = new Person("Ford Prefect", 200, 180, 10, "researcher for The Hitchhiker's Guide to the Galaxy");
		Person zaphod = new Person("Zaphod Beeblebrox", 203);
		
		System.out.println(arthur.getName());
		liam.printPerson();
		zaphod.printPerson();
		ford.printPerson();
		
	}

}
