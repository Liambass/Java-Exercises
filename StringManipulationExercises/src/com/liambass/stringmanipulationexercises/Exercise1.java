//Create two Strings where one string has a value of “yesterday it was raining” and the other string with a value of “today it is sunny”
//
//Concatenate both values, capitalise both strings and print out the result.
//The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
//
//Now use the substring method to print out: `TODAY IT IS RAINING`


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
