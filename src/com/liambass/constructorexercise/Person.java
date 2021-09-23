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
