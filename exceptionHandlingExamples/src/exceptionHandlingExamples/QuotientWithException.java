package exceptionHandlingExamples;

import java.util.Scanner;

/*
 * Terry James
 * Exception Handling
 * 8/20/2019
 * 
 * Some common exceptions are:
 * Linkage error, VirtualMachineError, ArithmeticException, NullPointerException,
 * IndexOutOfBoundsException, IllegalArgumentException, ClassNotFoundException,
 * IOException, InterrutptedIOException, EOFException, FileNotFountException
 */
public class QuotientWithException {
	public static void main(String[] args) {
		userInterFace();
	}
	
	
	//Method to allow users to input data
	public static void userInterFace() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		// A try/ catch block that is used for exception handling
		try { //try this first and if it fails
			int result = quotient(number1, number2);
			System.out.println(number1 + " / " + number2 + " is " + result);
		}
		catch(ArithmeticException ex) { //catch and display custom error
			System.out.println("Exception: an integer cannot be divided by zero");
		}
	}
	
	//Method for dividing to numbers and throws an erro is divding by zero.
	public static int quotient(int number1, int number2) {
		if(number2 == 0) {
			throw new ArithmeticException("Divisor cannot be zero");
		}
		return number1/ number2;
	}
	
	/*
	 * Getting information from an Exception
	 * getMessage(): String
	 * toString(): String
	 * printStackTrace(): void
	 * getStackTrace(): StackTraceElement[]
	 */
}
