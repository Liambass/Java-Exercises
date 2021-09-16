//1)Create a Person class with a few variables (height, name, shoe size, job title, age).
//2) Generate a constructor with all of them.
//3) Create another constructor that only has name and height.
//4) Create 2 methods that use these variable (e.g. greet - similar to the one I showed you). They SHOULD NOT be static.
//5) Create 4 instances of the Person class in your runner and call the methods.
//6) Upload your code to GitHub.


package com.liambass.constructorexercise;

public class Person {
	private String name;
	private int age;
	private float height;
	private float shoeSize;
	private String jobTitle;
	
	public Person(String name, int age, float height, float shoeSize, String jobTitle) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.shoeSize = shoeSize;
		this.jobTitle = jobTitle;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public void printPerson() {
		System.out.println(name + " is " + age + " years old. They are " + height + " cm tall with a shoe size of " + shoeSize + ". They make their living as a " + jobTitle + ".");
	}
		
	
	
	
}
