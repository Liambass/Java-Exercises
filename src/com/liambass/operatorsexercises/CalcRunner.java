package com.liambass.operatorsexercises;

public class CalcRunner {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.setNum1(23);
		calc.setNum2(45);
		
		System.out.println(calc.add());
		System.out.println(calc.sub());
		System.out.println(calc.mult());
		System.out.println(calc.div());
	}

}
