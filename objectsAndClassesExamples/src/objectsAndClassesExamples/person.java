package objectsAndClassesExamples;

/*
 * Terry James
 * Object and Classes Examples
 * 8/16/2019
 * 
 * This class is to show how to make an object class, constructor, and getter and setters.
 */
public class person {
	//Set variables to private so that they can only be used within this class.
	private String name;
	private int age;
	private String race;
	private String sex;
	
	//Constructor for creating new objects of this class.
	person(String newName, int newAge, String newRace, String newSex){
		name = newName;
		age = newAge;
		race = newRace;
		sex = newSex;
	}
	
	//Getter and Setters for this class.
	public String getName() {
		return name;
	}
	
	public void setName(String input) {
		name = input;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int input) {
		age = input;
	}
	
	public String getRace() {
		return race;
	}
	
	public void setRace(String input) {
		race = input;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String input) {
		sex = input;
	}
}
