//Create a method which accepts 3 parameters, 2 integers and a boolean.
//
//If the boolean is true, the method will return a sum of the two numbers, and it if is false it will return the multiplication of the two numbers.
//For example:
//
//Input (1, 2, true) -> 3
//Input (3, 3, false) -> 9
//Input (1, 1, true) -> 2
//Recreate the following flowchart (000.png) as a project. Ensure that your logic and outputs match that of the flowchart.

package com.liambass.conditionalsexercises;

public class Flowcharts {

	public static void main(String[] args) {
		float num1 = 120;
		float num2 = 42;
		boolean bool = false;
		System.out.println(addormult(num1, num2, bool));

		flowchart(num1);
	}

	private static void flowchart(float num) {
		if (num > 2000) {
			System.out.println("A");
			if (num > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (num > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println("1");
			if (num > 100) {
				System.out.println("3");
				if (num > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (num > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}

	}

	private static float addormult(float num1, float num2, boolean bool) {
		if (bool) {
			return num1 + num2;
		} else {
			return num1 * num2;
		}
	}

}
