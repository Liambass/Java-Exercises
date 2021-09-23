package com.liambass.hashmapexercise;

public class Runner {
	public static void main(String[] args) {
		
		MorseTranslator translator = new MorseTranslator();
		System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
		System.out.println(translator.code("this sentence will be encoded to morse"));
		
	}
}