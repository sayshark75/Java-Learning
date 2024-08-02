package StaticFactoryMethods;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("Dog can eat");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Dog can Bark");
		
	}
	
}
