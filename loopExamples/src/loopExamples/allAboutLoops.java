package loopExamples;
/* Terry James
 * Java basics practice
 * 8/14/2019
 * 
 * This is a program of simple examples for using for and while loops
 */

import java.util.Scanner;

public class allAboutLoops {
	public static void main(String[] args) {
		//theWhileLoop();
		//theForLoop();
		palindromeCheck();
	
	}
	
	public static void theWhileLoop() {
		char alphabet [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
							'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int arrayLength = alphabet.length-1;
		int index = 0;
		
		// Basic while loop
		while(index <= arrayLength) {
			System.out.println(alphabet[index]);
			index++;
		}
		
		// Do while loop
		index = 0;
		do {
			System.out.println(alphabet[index]);
			index++;
		} while(index <= arrayLength);
	}
	
	public static void theForLoop() {
		char alphabet [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
							'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int arrayLength = alphabet.length;
		
		//The i++ can be omitted but it then needs to be added to the body of the loop
		for(int i = 0; i < arrayLength; i++) {
			System.out.println(alphabet[i]);
		}
		
		//Nested For Loop pulled from text book
		//Source: Introduction to Java Programming 10th edition page 176
		System.out.println("             Multiplication Table");
		System.out.print("      ");
		// First is a 1D array to display top numbers.
		for(int j = 1; j <= 12; j++) {
			System.out.print("  " + j); // print puts everything on the same line
		}
		System.out.println();
		System.out.println("       ----------------------------------------");
		
		// A 2D array to display the left numbers and the multiplication between the top and left.
		for(int i = 1; i <= 12; i++) {
			System.out.print(i + " | ");
			for(int j = 1; j <= 12; j++) {
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}
	}
	
	public static void palindromeCheck() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String userInput = input.nextLine();
		
		//Set variable for first and last index to check if both char are the same
		int startIndex = 0;
		int lastIndex = userInput.length()-1;
		
		boolean isPalidrome = true;
		while(startIndex < lastIndex) { //Runs until the indexs meet in the middle
			if(userInput.charAt(startIndex) != userInput.charAt(lastIndex)) {
				isPalidrome = false;
				break;
			}
			//increase and reduce to eventually break the loop
			startIndex++;
			lastIndex--;
		}
		if(isPalidrome) {
			System.out.println(userInput + " is a palidrome.");
		}
		else {
			System.out.println(userInput + " is not a palidrome.");
		}
	}
}
