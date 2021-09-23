package com.liambass.encapsulationexercises;

public class Encapsulation {
	String name;
	int age;
	double height;
	float shoeSize;
	long phone;
	
	public Encapsulation(String name, int age, double height, float shoeSize, long phone) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.shoeSize = shoeSize;
		this.phone = phone;
	}
	public Encapsulation() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public float getShoeSize() {
		return shoeSize;
	}
	public void setShoeSize(float shoeSize) {
		this.shoeSize = shoeSize;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Encapsulation [name = " + name + ", age = " + age + ", height = " + height + ", shoeSize = " + shoeSize+ ", phone = " + phone + "]";
	}
	
	
	
	
}
