package com.liambass.enumexercise;

public class Runner {

	public static void main(String[] args) {
		Directions[] directions = Directions.values();

		for (Directions d : directions) {
			System.out.println(d);
			System.out.println(d.move());
		}

	}

}
