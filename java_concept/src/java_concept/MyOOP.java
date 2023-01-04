package java_concept;

public class MyOOP {
		
	public static String delimiter = "";
	
	public static void main(String[] args) {
		delimiter = "----";
		printA(delimiter);
		
		printA(delimiter);
		
		printB(delimiter);
		
		printB(delimiter);
		
		delimiter = "*****";
		printA(delimiter);
		
		printA(delimiter);
		
		printB(delimiter);
		
		printB(delimiter);
	}

	public static void printA(String delimiter) {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}

	public static void printB(String delimiter) {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
