package fileExamples;

/*
 * Terry James
 * Files
 * 8/20/2019
 * 
 * A program to show how reading and writing to a file works.
 */
import java.io.*;
import java.util.Scanner;

public class Files {
	public static void main(String[] args) throws IOException {
		File file = new File("scores.txt");
		fileExist(file);
		//writeWithAutoClose(file);
		//createFile(file);
	}
		
	//Method to check if the file already exist
	public static void fileExist(File file) throws IOException {
		if(file.exists()) {
			System.out.println("File already exist.");
			readFile(file);
		}
		else {
			System.out.println("Creating file.");
			readFile(file);
		}
	}
	
	//Method to create a file and auto close it
	public static void writeWithAutoClose(File file) throws IOException {
		try (PrintWriter output = new PrintWriter(file);) {
			output.print("John T Smith ");
			output.println(90);
			output.print("Thomas T Train ");
			output.println(23);
		}
	}
	
	//Method to create a file
	public static void createFile(File file) throws IOException {
		//Creates a new file
		PrintWriter output = new PrintWriter(file);
		
		//Writes to the file
		output.print("John T Smith ");
		output.println(90);
		output.print("Thomas T Train ");
		output.println(23);
		
		output.close(); //Remember to close the file when writing this way.
	}
	
	//Method to read the data from a file
	public static void readFile(File file) throws IOException {
		Scanner input = new Scanner(file); //Creates a scanner for the file
		
		while(input.hasNext()) { //while the file has data continue
			String firstName = input.next();
			String midName = input.next();
			String lastName = input.next();
			int score = input.nextInt();
			System.out.println(firstName + " " + midName + " " + lastName + " " + score);
		}
		input.close(); //Close the scanner
	}
}
