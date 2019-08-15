package methodExamples;

import java.util.Scanner;

public class allAboutMethods {
	public static void main(String[] args) {
		decimalInputs();
		integerInputs();
	}
	
	public static void decimalInputs() {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter two numbers seperated by a space: ");
		double userInput1 = input.nextDouble();
		double userInput2 = input.nextDouble();
		double result = max(userInput1, userInput2);
		System.out.println("The max value is: " + result);
	}
	
	//Method for integer inputs
	public static void integerInputs() {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter two numbers seperated by a space: ");
		int userInput1 = input.nextInt();
		int userInput2 = input.nextInt();
		max(userInput1, userInput2);
	}
	
	//Method that uses pass-by-value to find the largest number
	public static void max(int input1, int input2) {
		if(input1 > input2) {
			System.out.println(input1 + " is the larger number.");
		}
		else if(input1 < input2){
			System.out.println(input2 + " is the larger number.");
		}
		else {
			System.out.println("The numbers are equal");
		}
	}
	
	//Another method to show method overloading and how return statements work
	public static double max(double input1, double input2) {
		if(input1 > input2) {
			return input1;
		}
		else if(input1 < input2) {
			return input2;
		}
		else {
			return 0;
		}
	}
}
