//1) Create a new class call Encapsulation with 5 variables (one String, one integer, one double, one float and one long).
//2) Encapsulate your variables (make them private and generate getters and setters).
//3) Generate two constructors - one should be empty.
//4) Use setters to set values in your Runner.java.
//5) Use getters and System.out.println(); to print out the values in your Runner.java.
//6) Generate toString in your Encapsulation.java and invoke it from Runner.java.

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
