package com.qa.main;

public class Main {

	public static void main(String[] args) {
		//To declare a variable with a specific type simply specify the type at the beginning of the variable declaration, like this:
		boolean bool;
		byte bytes;
		char character;
		short number;
		int anotherNumber;
		long aLongNumber;
		float decimalNumber;
		double anotherDecimalNumber;
		
		//We can also initialise these variables like so:
		boolean bool = true;
		byte bytes = 8;
		char character = 'A';
		short number = 16;
		int anotherNumber = 32;
		long aLongNumber = 64L;
		float decimalNumber = 3.2f;
		double anotherDecimalNumber = 6.4d;
		
		//We can also specify what data type a method will return.
		//Every method needs to have a return type, even if that return type is void.
		//You can declare return types like so:
		public int methodName() {
		    return 0;
		}
		public boolean methodName() {
		    return true;
		}
		public char methodName() {
		    return 'P';
		}
		public long methodName() {
		    return 52L;
		}
		public float methodName() {
		    return 0.6f;
		}
		public String methodName() {
		    return "Hi there";
		}
		public void methodName() {
		    // no return
		}
		
		
		
		

	}

}
