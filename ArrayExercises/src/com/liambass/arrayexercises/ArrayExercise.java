//Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
//Create a for loop that populates an integer array with values, outputting them at each iteration.
//Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.

package com.liambass.arrayexercises;

public class ArrayExercise {

	public static void main(String[] args) {
		int[] numArray = {25, 43, 23, 46, 30, 42, 96, 73, 111, 2};
		printArray(numArray);
		int i = 10;
		int[] num2Array = arrayGen(i);
		print10Array(num2Array);
	}

	private static void print10Array(int[] num2Array) {
		for(int i : num2Array ) {
			i *= 10;
			System.out.print(i + " ");
		}
		System.out.println();

	}

	private static int[] arrayGen(int i) {
		int[] array = new int[i];
		for(int j = 0; j < array.length; j++) {
			array[j] = j;
			System.out.print(j + " ");
		}
		System.out.println();
		return array;
	}

	private static void printArray(int[] numArray) {
		for(int i : numArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}

}
