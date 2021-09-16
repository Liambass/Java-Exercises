package com.liambass.stringmanipulationexercises;

public class BottlesOfBeer {

	public static void main(String[] args) {
		int bottles = 10;
		for (int i = bottles; i > 0; i--) {
			System.out.println(i + " " + ((i != 1)? "bottles":"bottle")  + " of beer on the wall, " + i + " " + ((i != 1)? "bottles":"bottle") + " of beer.");
			System.out.println("Take one down and pass it around, " + (i - 1) + " " + ((i != 2)? "bottles":"bottle") + " of beer on the wall.");
		}
		
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.println("Go to the store and buy some more, " + bottles + " bottles of beer on the wall.");
	}

}
