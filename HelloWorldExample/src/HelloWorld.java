public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		String message = "Hello World!";
		
		System.out.println(message);
		
		printMessage(message);
		
		System.out.println(returnMessage());
		
	}

	public static void printMessage(String message) {
		System.out.println(message);
	}
	
	public static String returnMessage() {
		return "Hello World!";
	}
}
