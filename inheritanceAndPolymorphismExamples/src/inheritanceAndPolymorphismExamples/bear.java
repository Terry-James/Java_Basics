package inheritanceAndPolymorphismExamples;

/*
 * Terry James
 * 8/19/2019
 * 
 * This class is part of an example to show how the three pillars of OOP work
 * Encapsulation, Inheritance, and Polymorphism
 */

//Extends animal class to gain access to its variables/traits
public class bear extends animal implements Edible{
	private String age;
	private String diet;
	private String type;
	
	bear(){
		super();// calls animal constructor
	}
	
	bear(String newAge, String newDiet, String newType, String newSpecies, String newColor,
			int newLegs, String newSize){
		super(newColor, newLegs, newSize); //calls animal constructor and passes variables
		this.age = newAge;
		this.diet = newDiet;
		this.type = newType;
	}
	
	//Getters and Setters for this class
	public String getAge() {
		return age;
	}
	
	public void setAge(String input) {
		age = input;
	}
	
	public String getDiet() {
		return diet;
	}
	
	public void setDiet(String input) {
		diet = input;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String input) {
		type = input;
	}
	
	//toString method to display output
	@Override
	public String toString() {
		return "Age: " + age + " Diet: " + diet + " Type: " + type + " " + super.toString();
	}

	@Override
	public String howToEat() {
		// TODO Auto-generated method stub
		return "can't eat";
	}

}
