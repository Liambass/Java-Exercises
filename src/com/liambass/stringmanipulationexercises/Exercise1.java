package com.liambass.stringmanipulationexercises;

public class Exercise1 {

	public static void main(String[] args) {
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		String str3 = str1 + " " + str2;
		System.out.println(str3.toUpperCase());
		System.out.println(str3.substring(25, 37).toUpperCase() + str3.substring(17, 24).toUpperCase());
	}

}
