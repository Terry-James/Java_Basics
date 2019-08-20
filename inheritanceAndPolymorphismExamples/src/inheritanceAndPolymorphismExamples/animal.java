package inheritanceAndPolymorphismExamples;

/*
 * Terry James
 * 8/19/2019
 * 
 * This class is part of an example to show how the three pillars of OOP work
 * Encapsulation, Inheritance, and Polymorphism
 */

// Class for animals
public class animal {
	private String species;
	private String color;
	private int legs;
	private String size;
	
	//Constructors
	animal(){
	}
	
	animal(String newSpecies, String newColor, int newLegs, String newSize){
		species = newSpecies;
		color = newColor;
		legs = newLegs;
		size = newSize;
	}
	
	//Getter and Setters
	protected void setSpecies(String input) {
		species = input;
	}
	
	protected String getSpecies() {
		return species;
	}
	
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
		return "Species: " + species + " Color: " + color + " Number of legs: " + legs +
				" Size: " + size;
	}
}
