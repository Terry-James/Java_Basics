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
	public void setSpecies(String input) {
		species = input;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setColor(String input) {
		color = input;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setLegs(int input) {
		legs = input;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setSize(String input) {
		size = input;
	}
	
	public String getSize() {
		return size;
	}
	
	//toString method for printing results
	@Override
	public String toString() {
		return "Species: " + species + " Color: " + color + " Number of legs: " + legs +
				" Size: " + size;
	}
}
