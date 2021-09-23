package com.liambass.operatorsexercises;

public class Calculator {
	
	private int num1;
	private int num2;
	
	public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public Calculator() {
		super();
	}
	

	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	double div() {
		return (double) num1 / (double) num2;
	}

	int mult() {
		return num1 * num2;
	}

	int sub() {
		return num1 - num2;
	}

	int add() {
		return num1 + num2;
	}

}
