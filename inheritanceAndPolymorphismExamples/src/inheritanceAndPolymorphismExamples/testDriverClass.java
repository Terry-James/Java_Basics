package inheritanceAndPolymorphismExamples;
/*
 * Terry James
 * 8/19/2019
 * 
 * This class is part of an example to show how the three pillars of OOP work
 * Encapsulation, Inheritance, and Polymorphism
 * Abstract class and Interface
 */

public class testDriverClass {
	public static void main(String[] args) {
		testingClasses();
//		testing();
//		
//		animal smokey = new bear("adult", "berries or meat", "polar", "bear", "brown", 4, "large");
//		animal yogi = new bear("adult", "berries or meat", "polar", "bear", "brown", 4, "large");
//		checkObjectEquals(smokey, yogi);
//		checkObjectEquals(smokey, smokey);

	}
	
	public static void testing() {
		bear smokey = new bear("adult", "berries or meat", "polar", "bear", "brown", 4, "large");
		bear another = new bear();
		
		//Check if object is a bear by using instanceof
		Object someAnimal = new bear();
		if(someAnimal instanceof bear) {
			someAnimal = new bear("adult", "berries or meat", "polar", "bear", "brown", 4, "large");
		}
			
		System.out.println(smokey.toString());
		System.out.println(another.toString());
		System.out.println(someAnimal.toString());
	}
	
	public static void checkObjectEquals(Object object1, Object object2) {
		if(object1.equals(object2)) {
			System.out.println("The objects are equal.");
		}
		else {
			System.out.println("The objects are not equal.");
		}
	}
	
	public static void testingClasses() {
		bear thisAnimal = new bear();
		
		System.out.println("Bear age: " + thisAnimal.getColor());
		thisAnimal.setColor("brown");
		System.out.println("Bear age: " + thisAnimal.getColor());
		System.out.println("Bear age: " + thisAnimal.howToEat());


	}
}
