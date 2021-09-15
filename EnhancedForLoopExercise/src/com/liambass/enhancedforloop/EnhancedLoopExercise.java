//Create an array of strings and iterate through it, printing each value to console, using an enhanced for loop.
//
//Create an array of integers 1-20 and iterate through it, using an enhanced for loop, square, and then print each value.
//
//Create a method that returns a boolean and accepts an integer as a parameter, if the integer is even, return true, if not then return false.
//
//Using the array of integers from exercise 2 and the method created in exercise 3; iterate through the array using an enhanced for loop, calling the method from exercise 3 in the body.
//
//If the value is even, cube it, then print it to console.
//If the value is odd, square it, then print it to console.


package com.liambass.enhancedforloop;

public class EnhancedLoopExercise {

	public static void main(String[] args) {
		String[] strArr = {"This", "is", "a", "String", "array"};
		printArr(strArr);
		int i = 20;
		int[] intArr = arrayGen(i);
		squArr(intArr);
		squOrCube(intArr);
		
	}

	private static void squOrCube(int[] intArr) {
		for(int i : intArr) {
			if (even(i)) {
				i = (int) Math.pow(i, 3);
				System.out.print(i + " ");
			} else {
				i = (int) Math.pow(i, 2);
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	private static void squArr(int[] intArr) {
		for (int i : intArr) {
			i = (int) Math.pow(i, 2);
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static int[] arrayGen(int i) {
			int[] array = new int[i];
			for(int j = 0; j < array.length; j++) {
				array[j] = j + 1;
			}
			return array;
		
	}

	private static void printArr(String[] strArr) {
		for(String i : strArr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static boolean even(int i) {
		if(i % 2 == 0) {return true;}
		else {return false;}
	}
}
