//Consider the god-class Greeter.java, which is meant to return a greeting message depending on the type selected:
//
//Greeter
//public class Greeter{
//    private String greetingType;
//
//    public String greet(){
//        if ("formal".equals(this.greetingType)){
//            return "Good evening, Sir.";
//        }
//        else if ("casual".equals(this.greetingType)) {
//            return "Sup m8?";
//        }
//        else {
//            return "Hello";
//        }
//    }
//
//    public void setGreetingType(String greetingType) {
//        this.greetingType = greetingType;
//    }
//}
//Greeter.java violates the Open/Closed Principle, because any time we would want to change the style of greeting, we would have to change the functionality of greet() every single time.
//
//Implement the following classes and/or interfaces to complete this exercise:
//
//Greeting.java
//FormalGreeting.java
//CasualGreeting.java
//Greeter.java



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
