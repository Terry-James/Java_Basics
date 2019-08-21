package inheritanceAndPolymorphismExamples;

/*
 * Terry James
 * 8/19/2019
 * 
 * This class is part of an example to show how the three pillars of OOP work
 * Encapsulation, Inheritance, and Polymorphism
 */

// Class for animals
public abstract class animal {
	private String color;
	private int legs;
	private String size;
	
	//Constructors
	protected animal(){
	}
	
	protected animal(String newColor, int newLegs, String newSize){
		color = newColor;
		legs = newLegs;
		size = newSize;
	}
	
	//Getter and Setters
	protected void setColor(String input) {
		color = input;
	}
	
	protected String getColor() {
		return color;
	}
	
	protected void setLegs(int input) {
		legs = input;
	}
	
	protected int getLegs() {
		return legs;
	}
	
	protected void setSize(String input) {
		size = input;
	}
	
	protected String getSize() {
		return size;
	}
	
	//toString method for printing results
	@Override
	public String toString() {
		return " Color: " + color + " Number of legs: " + legs +
				" Size: " + size;
	}
}
