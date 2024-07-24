package AbstractClasses;

//in Java there are 3 valid structures

//1 - Normal or concrete class (Fully implemented structure) => Implemented? => method with body
//2 - Abstract class (Partially implemented structure)
//3 - Interface (fully unimplemented structure)

//there are two abstract types
	// Abstract class (Partially Implemented Structure)
	// Abstract method

// in Normal Class we cannot keep a method without body or a abstract method
// abstract can be empty also

// What is Abstract: (Kalpana || कल्पना || visualized)
// lets say there is a Animal class which has following methods
// eat(), sleep(), walk(), makeNoise()
// now we can create different Animals like
// Dog, Cat, Lion, Tiger
// and we can say Animal tommy = new Dog();
// like: Tommy is a Dog;
// and also say Animal tommy = new Animal();
// like: Tommy is a Animal, but is it valid?, can you show me Animal, not movie ok!
// so here Animal is Abstract thing
// so restrict a user that he cannot create object of animal class directly, 
// then we have to mark Animal class as Abstract, by using abstract keyword

// Abstract class can have concrete methods and abstract methods also
// like the makeNoise method is different for each new Inheriting class,
// so we keep it abstract, so the child class can override it with its own body.



public abstract class AbstractClasses {
	
	// It can have constructor, static method, main method
	// it can override other methods of another abstract/normal class
	// it can extend another abstract/normal classes
	
	// this method can be override or may not be override in child class
	public void funA() {
		System.out.println("Inside funA of Abstract class");
	}
	
	// this method Must be override in child class
	public abstract void funB();
	
	// this method must not be override in child class
	public final void funC() {
		System.out.println("Inside funC of Abstract Class");
	}
}
