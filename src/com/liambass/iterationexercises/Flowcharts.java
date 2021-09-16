//Recreate the following flowcharts (000.png and 001.png)

package com.liambass.iterationexercises;

public class Flowcharts {

	public static void main() {
		flow1();
		flow2();
		printNum10();
		printNumNum();

	}

	private static void printNumNum() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(i);
			}
		}

	}

	private static void printNum10() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i);
			}
		}

	}

	private static void flow2() {
		for (int A = 100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}

	}

	private static void flow1() {
		for (int A = 100; A <= 200; A++) {
			System.out.println(A);
		}
	}

}
