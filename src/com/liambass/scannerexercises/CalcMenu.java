package com.liambass.scannerexercises;

import java.util.Scanner;

public class CalcMenu {

	public void menu() {

		double num1, num2;
		boolean menuFlag = true;
		String option = "";
		Scanner scan = new Scanner(System.in);

		while (menuFlag) {
			System.out.println("/-------------------------------------------\\");
			System.out.println("| What operation would you like to perform? |");
			System.out.println("|-------------------------------------------|");
			System.out.println("|	(1) Addition			    |");
			System.out.println("|	(2) Subtraction			    |");
			System.out.println("|	(3) Multiplication		    |");
			System.out.println("|	(4) Division			    |");
			System.out.println("|-------------------------------------------|");
			System.out.println("|	(0) Exit			    |");
			System.out.println("\\-------------------------------------------/");

			option = scan.nextLine();

			switch (option) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "0":
				menuFlag = false;
				continue;
			default:
				System.out.println("Your input was invalid, please try again. ");
				continue;
			}

			System.out.print("Please enter your first number. ");
			num1 = scan.nextInt();
			scan.nextLine();

			System.out.print("Please enter your second number. ");
			num2 = scan.nextInt();
			scan.nextLine();

			switch (option) {
			case "1":
				System.out.println(Calculator.add(num1, num2));
				break;
			case "2":
				System.out.println(Calculator.sub(num1, num2));
				break;
			case "3":
				System.out.println(Calculator.mult(num1, num2));
				break;
			case "4":
				System.out.println(Calculator.div(num1, num2));
				break;
			default:
				break;
			}
		}
		scan.close();
	}
}
