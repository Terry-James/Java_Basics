package stringBuilder;

import java.util.Scanner;

/*
 *Terry James
 *String builder examples
 *8/19/2019
 *
 * This program shows examples of how the string builder class works. 
 * Reminder: StringBuffer is used if multiple resources are accessing the string at the same time
 * because StringBuffer is synchronized.
 */
public class stringBuilderClass {
	public static void main(String[] args) {
		//buildingString();
		userInterface();
	}
	
	//Method for users to enter there input
	public static void userInterface() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String userInput = input.nextLine();
		System.out.println("Ignoring nonalphanumeric characters, \nis " + userInput + 
							" a palindrome? " + isPalindrome(userInput));
	}
	
	//Method to determine if a string is a palindrome
	public static boolean isPalindrome(String input) {
		String value1 = filter(input);
		String value2 = reverse(value1);
		return value2.equals(value1); // Finally check they are equal to determine if palindrome.
	}
	
	//Method to make sure the string contains only letters and numbers, skipping all others
	public static String filter(String input) {
		StringBuilder thisString = new StringBuilder();
		
		for(int i = 0; i < thisString.length(); i++) {
			if(Character.isLetterOrDigit(input.charAt(i))) {// character class for letters and numbers
				thisString.append(input.charAt(i));
			}
		}
		return thisString.toString();
	}
	
	//Method to reverse the string to get it ready to check with the original for equality
	public static String reverse(String input) {
		StringBuilder thisString = new StringBuilder(input);
		thisString.reverse();
		return thisString.toString();
	}
	
	//Method to show how the string builder class works and some of its features.	
	public static void buildingString() {
		StringBuilder builtString = new StringBuilder();
		builtString.append("Welcome");
		builtString.append(' ');
		builtString.append("to");
		builtString.append(' ');
		builtString.append("Java");
		System.out.println(builtString);
		
		
		builtString.insert(11, "HTML and ");
		System.out.println(builtString);
		
		builtString.delete(8, 11);
		builtString.deleteCharAt(1);
		builtString.reverse();
		builtString.replace(11, 15, "HTML");
		builtString.setCharAt(0, 'w');
		
		System.out.println(builtString);

		


		
	}
}
