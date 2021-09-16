package com.liambass.encapsulationexercises;

public class Runner {

	public static void main(String[] args) {
		Encapsulation enc = new Encapsulation();
		enc.setName("Liam");
		enc.setAge(33);
		enc.setHeight(203);
		enc.setShoeSize(14);
		enc.setPhone(111222333);

		System.out.println(enc.getName());
		System.out.println(enc.getAge());
		System.out.println(enc.getHeight());
		System.out.println(enc.getShoeSize());
		System.out.println(enc.getPhone());
		
		System.out.println(enc.toString());
	}

}
