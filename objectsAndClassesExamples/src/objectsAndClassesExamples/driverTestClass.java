package objectsAndClassesExamples;

import java.util.Scanner;

/*
 * Terry James
 * objects and classes examples
 * 8/16/2019
 * 
 * A driver test class to make sure the persons object was implemented correctly. I also
 * shows how to pass an object to a method and retrieve the information using the getters
 * and setters.
 */
public class driverTestClass {

	public static void main(String[] args) {
		userInterface();
	}
	
	//User interface for information to be entered about a person
	public static void userInterface() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a first name:");
		String userName = input.nextLine();
		System.out.println("Enter an age: ");
		int userAge = input.nextInt();
		input.nextLine();
		System.out.println("Enter a race: ");
		String userRace = input.nextLine();
		System.out.println("Enter your sex: ");
		String userSex = input.nextLine();
		
		//Creates a new person object and sets all variable to what the user inputed. 
		person aPerson = new person(userName, userAge, userRace, userSex);
		personInfo(aPerson); // pass object to method

	}
	
	//Method to show how to set and retrieve information from the object.
	public static void personInfo(person thisPerson) {
		thisPerson.setName("Tom"); // just to show how a setter works.
		System.out.println("Name: " + thisPerson.getName());
		System.out.println("Age: " + thisPerson.getAge());
		System.out.println("Race: " + thisPerson.getRace());
		System.out.println("Sex: " + thisPerson.getSex());
	}

}
