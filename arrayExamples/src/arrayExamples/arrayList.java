package arrayExamples;
/*
 * Terry James
 * 8/19/2019
 * 
 * This program is to show how Array List work and the syntax that goes with it.
 * Uses the Java built-in implementation of ArrayList.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayList {
	public static void main(String[] args) {
		//userInterface();
		//testData();
		arrayToList();
	}
	
	//Method for creating test data for using an arraylist.
	public static void testData() {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Tom");
		names.add("Terry");
		names.add("Frank");
		names.add("Susan");
		names.add("Bill");
		names.add("Jessica");
		names.add("Peyton");
		names.add("Haley");
		names.add("Elijah");
	
		arrayListFeatures(names);
	}
	
	//Method for showing some of the main features used with arraylist.
	public static void arrayListFeatures(ArrayList<String> list) {
		System.out.println("contains example: " + list.contains("Tom"));
		printList(list);
		System.out.println("remove example: " + list.remove("Susan"));
		printList(list);
		System.out.println("\nindexOf example: " + list.indexOf("Bill"));
		System.out.println("get example: " + list.get(2));
		System.out.println("isEmpty example: " + list.isEmpty());
		System.out.println("size example: " + list.size());

	}
	
	//Method for entering user data
	public static void userInterface() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter states you have been to or exit to quit: ");
		boolean status = true;
		String userInput = " ";
		
		//Use an array list to store user inputs
		ArrayList<String> states = new ArrayList<>();
		
		while(status) {	
			userInput = input.nextLine();
			if(userInput.equals("exit")) {
				status = false;
				break;
			}
			states.add(userInput);
		}	
		printList(states); //Print the list
	}
	
	public static void arrayToList() {
		//Convert an array to a list
		String [] array = {"Frank", "Susan", "Tom", "Anna"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
		printList(list);
		
		//Convert the list back to an array
		String [] anotherArray = new String[list.size()];
		list.toArray(anotherArray);
		
		//Sorts a list using the java collections class for sorting
		Integer[] numberArray = {5, 9, 23, 50, 70, 11, 67, 2};
		ArrayList<Integer> anotherList = new ArrayList<>(Arrays.asList(numberArray));
		java.util.Collections.sort(anotherList);
		System.out.println(anotherList);
		
		//Find Max and Min of a list
		Integer[] numberArray2 = {5, 9, 23, 50, 70, 11, 67, 2};
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(numberArray2));
		System.out.println(java.util.Collections.max(list2));
		System.out.println(java.util.Collections.min(list2));
	}
	
	//Method for printing the contents of an arraylist.
	public static void printList(ArrayList<String>list) {
		for(String display: list) { // a foreach loop to display contents
			System.out.print(display + " ");
		}
	}
}
