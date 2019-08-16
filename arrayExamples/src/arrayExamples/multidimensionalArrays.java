package arrayExamples;

import java.util.Scanner;

public class multidimensionalArrays {
	public static void main(String [] args) {
		//testInput();
		//inputToMultiArray();
		randomFill();
	}
	
	public static void testInput() {
		int [][] data = {{3,4,7,5,2,6,9},
						 {6,8,33,55,12,77,23},
						 {43,65,12,16,73,44,48}
						};
	
		//Each row is a 1D array so obtaining the length is:
		int arrayLength = data[0].length; //Without [index] the length would be 3
		processingTwoDimensional(data);
	}
	
	//Method to show how to use scanner for user inputs in a multidimensional array.
	public static void inputToMultiArray() {
		int [][] data = new int[3][3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 9 numbers followed by spaces");
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				data[i][j] = input.nextInt();
			}
		}
		processingTwoDimensional(data);
	}
	
	//Method to randomly fill the 2d array with numbers.
	public static void randomFill() {
		int [][] data = new int[3][3];
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j <data[i].length; j++) {
				data[i][j] = (int)(Math.random() * 100);
			}
		}
		processingTwoDimensional(data);
	}
	
	//Method to show how to print the 2D array and also pass it to a method
	public static void processingTwoDimensional(int [][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j <array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}
