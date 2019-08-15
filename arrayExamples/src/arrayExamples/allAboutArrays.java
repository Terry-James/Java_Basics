package arrayExamples;

import java.util.Scanner;

/*
 * Terry James
 * Array Practice
 * 8/15/2019
 * 
 * The programs shows examples of how arrays are created and used to find the max number of a set
 * by comparing each number using the index to access each element in the array.
 */

public class allAboutArrays {
	
	/*
	 * Arrays can be created by using:
	 * int array = new int[size];
	 * or
	 * int array = {1,2,3,4};
	 */

	public static void main(String[] args) {
		//userInterface();
		//copyingArrays();
		//arrayInputs();
		variableLenghtParameters(35,5,80,60,3);
	}

	//Method for getting user input
	public static void userInterface() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five different numbers: ");
		int [] userInputs = new int [5];
		int arrayLength = userInputs.length;
		
		for(int i = 0; i < arrayLength; i++) {
			userInputs[i] = input.nextInt();
		}
		
		int result = findMax(userInputs, arrayLength);
		System.out.println("The largest number is: " + result);
	}
	
	//Simple method for find the max of a set of numbers
	public static int findMax(int [] values, int size) {
		int max = values[0];
		for(int i = 0; i < size; i++) {
			if(values[i] > max) {
				max = values[i];
			}
			else if(values[i] < max) {
				continue;
			}
			else {
				continue;
			}
		}
		return max; //returns the largest number in the array
	}
	
	//Method for showing different ways to copy arrays
	public static void copyingArrays() {
		int [] firstArray = {1,2,3,4,5};
		int firstLength = firstArray.length;
		int [] secondArray = new int[firstLength];
		/*
		for(int i = 0; i < firstLength; i++) {
			secondArray[i] = firstArray[i];
		}
		*/
		//or
		//When using array copy the destination array must already be defined.
		System.arraycopy(firstArray, 0 , secondArray, 0, firstLength);
		
		for(int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i] + " ");
		}
	}
	
	/*
	 *Method to show that passing an array to a method is done using pass-by-sharing
	 *because the array is passing its reference and its value. 
	 */
	public static void arrayInputs() {
		int [] array = {1,2,3,4,5,6};
		passingArrays(array);
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	/*Method to show that making a change to the parameter array also makes 
	 *the change to the original array being passed
	 */
	public static void passingArrays(int [] values) {
		values[2] = 4;
		return;
	}
	
	//Method to show how variable-length parameters are used. The parameter is turned into an array.
	public static void variableLenghtParameters(int... numbers) {
		int result = findMax(numbers, numbers.length);
		System.out.println("The largest Number is " + result);
	}
}
