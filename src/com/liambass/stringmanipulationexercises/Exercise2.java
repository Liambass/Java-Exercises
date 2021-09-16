//For this task you are to implement 4 methods that manipulate String objects. For all parts of this section you are only allowed to use the length(), substring(), and equals() methods. Avoid using arrays or any methods you have yet to be taught as this defeats the purpose of the exercise:
//
//Method 1 - When given a String, count and return how many words there are in that String.
//Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
//Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
//Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. A boolean value should be returned to indicate whether or not the second String has been found in the message.


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
