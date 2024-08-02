package StaticFactoryMethods;

// it is a simple animal abstract class 
// has some methods to be override
public abstract class Animal {
	
	public abstract void eat();
	public abstract void makeSound();
	
	// here we are creating a static factory method to get specific objects
	public static Animal getAnimalInstance(String name) {
		if(name=="Dog") {
			return new Dog();
		}else if(name=="Tiger") {
			return new Tiger();
		}else {
			return null;
		}
	}
	
}
