package com.liambass.stringmanipulationexercises;

public class Exercise2 {

	public static void main(String[] args) {
		String str = "This is a sentence made of many words, which in turn, are made of many characters.";
		String test = "which in turn";
		System.out.println(wordCount(str));
		wordToLine(str);
		wordToLineRev(str);
		System.out.println("test case contained in string? " + contains(str, test));   
		

	}

	private static boolean contains(String str, String test) {
		for (int j = 0; j < str.length() - test.length(); j++) {
			if (str.substring(j, j + test.length()).equals(test)) {return true;}
		}
		return false;
	}

	private static void wordToLineRev(String str) {
		int i = str.length();
		for (int j = i -1 ; j >= 0 ; j--) {
			if (str.charAt(j) == ' ') {
				System.out.println(str.substring(j + 1, i));
				i = j;	
			}	
		}
		System.out.println(str.substring(0, i));
		
	}

	private static void wordToLine(String str) {
		int i = 0;
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == ' ') {
				System.out.println(str.substring(i, j));
				i = j + 1;	
			}	
		}
		System.out.println(str.substring(i));
	}

	private static int wordCount(String str) { //assumes str does NOT end with a " "
		int i = 1; 
		for(int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == ' ') {i++;}
		}
		return i;
	}
}
