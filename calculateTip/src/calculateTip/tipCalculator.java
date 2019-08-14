package calculateTip;

import java.util.Scanner;

public class tipCalculator {
	public static void main(String[] args) throws Exception {
        //userInterface();
		simpleInput();
	}
	
	// User Interface for entering the data 
	public static void userInterface() {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        String userInput = input.nextLine();
        input.close();

        calculateTip(userInput);
	}
	
	// Simple way of getting the data and doing the calculations
	public static void simpleInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		input.close();
		
		double tip = subtotal * (gratuity / 100);
		double total = subtotal +  tip;
		
        System.out.println("The gratuity is " + "$" + tip + " and total is " + "$" +total);
	}

	// Another way to do the calculations by using an array and converting string to decimal
    public static void calculateTip(String inputs){
        String values [] = inputs.split(" ");

        double subtotal = Double.valueOf(values[0]).doubleValue();
        double gratuity = Double.valueOf(values[1]).doubleValue();

        double tip = subtotal * (gratuity / 100);
        double total = subtotal + tip;

        System.out.println("The gratuity is " + "$" + tip + " and total is " + "$" +total);
    }
}
