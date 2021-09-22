package com.liambass.exceptionsexercise;


public class CalcMenu {

	public void menu() {

		double num1, num2;
		boolean menuFlag = true;
		int option;
		Input input = new Input();

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

			option = input.getInt();

			switch (option) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 0:
				menuFlag = false;
				System.out.println("Goodbye.");
				continue;
			default:
				System.out.println("Your input was invalid, please try again. ");
				continue;
			}

			System.out.print("Please enter your first number. ");
			num1 = input.getDouble();

			System.out.print("Please enter your second number. ");
			num2 = input.getDouble();

			switch (option) {
			case 1:
				System.out.println(num1 + " + " + num2 + " = " + Calculator.add(num1, num2));
				break;
			case 2:
				System.out.println(num1 + " - " + num2 + " = " + Calculator.sub(num1, num2));
				break;
			case 3:
				System.out.println(num1 + " x " + num2 + " = " + Calculator.mult(num1, num2));
				break;
			case 4:
				try {
					System.out.println(num1 + " ÷ " + num2 + " = " + Calculator.div(num1, num2));
				} catch (DivException e) {
					System.out.println((num2 == 0) ? "Error: Cannot divide by zero" : "Error: Cannot divide by a larger number");
				}
				break;
			default:
				break;
			}
		}
	}
}
