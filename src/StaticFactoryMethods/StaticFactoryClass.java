package StaticFactoryMethods;

import java.util.Calendar;

// Static Factory method is used to hide the object creation process from the user.
// instead of generating from the class, we use a static method to provide us the 
// required object
// ex: Animal class which is abstract
// using this abstract class, we can create 
// Dog, Cat, Tiger, Lion classes by inheritance/extending Animal class
// now we can create a factory class which will provide us the required animal class
// like if in the static factory method, we put string as "Dog"
// then it will providing us the Dog Class Object

public class StaticFactoryClass {
	
	// static factory method is created like this
	public static StaticFactoryClass getAppropriateInstance() {
		return new StaticFactoryClass();
	}
	
	int a = 10;
	
	public static void main(String[] args) {
		StaticFactoryClass sf1 = StaticFactoryClass.getAppropriateInstance();
		System.out.println(sf1.a);

		// example of animal class
		
		Animal dog = Animal.getAnimalInstance("Dog");
		dog.eat();
		dog.makeSound();
		
		Animal Tiger = Animal.getAnimalInstance("Tiger");
		Tiger.eat();
		Tiger.makeSound();
		
		// example of calendar class
		// we cannot instantiate the calendar class
		// Calendar c1 = new Calendar();
		
		// we can use its static factory method to get the instance/object
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.getTime());
		
	
	}
	

	
}
