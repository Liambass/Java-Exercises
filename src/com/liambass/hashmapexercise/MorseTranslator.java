package com.liambass.hashmapexercise;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {

	private Map<String, String> morseToEnglish = new HashMap<>();
	private Map<String, String> englishToMorse = new HashMap<>();

	public MorseTranslator() {
		morseToEnglish.put(".-", "A");
		morseToEnglish.put("-...", "B");
		morseToEnglish.put("-.-.", "C");
		morseToEnglish.put("-..", "D");
		morseToEnglish.put(".", "E");
		morseToEnglish.put("..-.", "F");
		morseToEnglish.put("--.", "G");
		morseToEnglish.put("....", "H");
		morseToEnglish.put("..", "I");
		morseToEnglish.put(".---", "J");
		morseToEnglish.put("-.-", "K");
		morseToEnglish.put(".-..", "L");
		morseToEnglish.put("--", "M");
		morseToEnglish.put("-.", "N");
		morseToEnglish.put("---", "O");
		morseToEnglish.put(".--.", "P");
		morseToEnglish.put("--.-", "Q");
		morseToEnglish.put(".-.", "R");
		morseToEnglish.put("...", "S");
		morseToEnglish.put("-", "T");
		morseToEnglish.put("..-", "U");
		morseToEnglish.put("...-", "V");
		morseToEnglish.put(".--", "W");
		morseToEnglish.put("-..-", "X");
		morseToEnglish.put("-.--", "Y");
		morseToEnglish.put("--..", "Z");
		morseToEnglish.put("/", " ");
		morseToEnglish.put(".----", "1");
		morseToEnglish.put("..---", "2");
		morseToEnglish.put("...--", "3");
		morseToEnglish.put("....-", "4");
		morseToEnglish.put(".....", "5");
		morseToEnglish.put("-....", "6");
		morseToEnglish.put("--...", "7");
		morseToEnglish.put("---..", "8");
		morseToEnglish.put("----.", "9");
		morseToEnglish.put("-----", "0");
		
		englishToMorse.put("A", ".-");
		englishToMorse.put("B", "-...");
		englishToMorse.put("C", "-.-.");
		englishToMorse.put("D", "-..");
		englishToMorse.put("E", ".");
		englishToMorse.put("F", "..-.");
		englishToMorse.put("G", "--.");
		englishToMorse.put("H", "....");
		englishToMorse.put("I", "..");
		englishToMorse.put("J", ".---");
		englishToMorse.put("K", "-.-");
		englishToMorse.put("L", ".-..");
		englishToMorse.put("M", "--");
		englishToMorse.put("N", "-.");
		englishToMorse.put("O", "---");
		englishToMorse.put("P", ".--.");
		englishToMorse.put("Q", "--.-");
		englishToMorse.put("R", ".-.");
		englishToMorse.put("S", "...");
		englishToMorse.put("T", "-");
		englishToMorse.put("U", "..-");
		englishToMorse.put("V", "...-");
		englishToMorse.put("W", ".--");
		englishToMorse.put("X", "-..-");
		englishToMorse.put("Y", "-.--");
		englishToMorse.put("Z", "--..");
		englishToMorse.put(" ", "/");
		englishToMorse.put("1", ".----");
		englishToMorse.put("2", "..---");
		englishToMorse.put("3", "...--");
		englishToMorse.put("4", "....-");
		englishToMorse.put("5", ".....");
		englishToMorse.put("6", "-....");
		englishToMorse.put("7", "--...");
		englishToMorse.put("8", "---..");
		englishToMorse.put("9", "----.");
		englishToMorse.put("0", "-----");
	}                        
	
	

	public String translate(String input) {
		String out = "";
		String[] morseChars = input.split(" ");
		for (String i : morseChars)
			out += morseToEnglish.get(i);
		return out;
	}



	public String code(String input) {
		String out = "";
		String[] engChars = input.toUpperCase().split("");
		for (String i : engChars)
			out += englishToMorse.get(i) + " ";
		return out;
	}
	
	
	



	
	
	
	
	
}
