package com.liambass.openclosedexercise;

public class Runner {
	public static void main(String[] args) {

		Greeting form = new FormalGreeting();
		Greeting cas = new CasualGreeting();
		Greeter g = new Greeter();
		
		System.out.println(g.greet(form));
		System.out.println(g.greet(cas));
		System.out.println(g.greet(new StandardGreeting()));
		
		
	}
}
