package stringExamples;

/*
 * Terry James
 * Java basics practice
 * 8/14/2019
 * 
 * This is a program for different ways to navigate and manipulate strings. 
 */

public class allAboutStrings {
	public static void main(String[] args) {
		//testingCharacterClass();
		//playingWithStrings();
		findingSubstrings();
	}
	
	// Method to show how the Character Class works
	public static void testingCharacterClass() {
		// Used to prevent declaring new variable for each char
		char [] array = {'a', 'b', 'c', 'd', 'E', 'f', 'G'};
		
		System.out.println("Result = " + Character.isDigit(array[0]));
		System.out.println("Result = " + Character.isLetter(array[1]));
		System.out.println("Result = " + Character.isLetterOrDigit(array[2]));
		System.out.println("Result = " + Character.isLowerCase(array[3]));
		System.out.println("Result = " + Character.isUpperCase(array[4]));
		System.out.println("Converted to: " + Character.toUpperCase(array[5]));
		System.out.println("Converted to: " + Character.toLowerCase(array[6]));
	}
	
	//Several ways to compare strings to each other along with finding length and specific characters
	public static void playingWithStrings() {
		String message = "Welcome to Java";
		String addedWord = "Friend";
		String singleWord = "Java";
		
		System.out.println("The length of message is: " + message.length());
		System.out.println("The character at index 4 is: " + message.charAt(4));
		System.out.println("The last letter is: " + message.charAt(message.length()-1));
		// You can also concatenate a string with the + or +=
		System.out.println("The output when concatenating both strings is: " +
							message.concat(addedWord));
		
		// Comparing Strings
		// Remember to use equals for string comparison.
		System.out.println("equals example: " + message.equals(addedWord));
		System.out.println("equalsIgnoreCase example: " + message.equalsIgnoreCase(addedWord));
		System.out.println("compareTo example: " + message.compareTo(addedWord));
		System.out.println("compareToIgnoreCase example: " + message.compareToIgnoreCase(addedWord));
		System.out.println("startsWith example: " + message.startsWith("Wel"));
		System.out.println("endsWith example: " + message.endsWith("va"));
		System.out.println("contains example: " + message.contains(singleWord));
	}
	
	//How to find the index of a substring or the substring given the index
	public static void findingSubstrings() {
		String message = "Welcome to Java it is a great language to learn";
		
		System.out.println("substring example with beginning index: " + message.substring(4));
		//Remember that the last index is not included it is index-1
		System.out.println("substring example with both beginning and end index: " +
							message.substring(4, 10));
		//IndexOf can also take a second parameter for a fromIndex
		System.out.println("indexOf for char example: " + message.indexOf('o'));
		System.out.println("indexOf for string example: " + message.indexOf("to"));
		System.out.println("lastIndexOf for char example: " + message.lastIndexOf('o'));
		System.out.println("lastIndexOf for String example: " + message.lastIndexOf("to"));
	}
}
