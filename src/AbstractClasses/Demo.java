package AbstractClasses;

// we cannot instantiate, o create object of abstract class
// whether it has abstract method or not or it is empty
// AbstractClasses a = new AbstractClasses();

// we can do everything with the abstract class except this 3 things
// 1 - we cannot create object of the abstract class Directly, 
	// but can be create using its child (indirectly)
// 2 - we can add abstract method also
// 3 - normal class can be final, but abstract class cannot be final 
// 4 - abstract methods cannot be static, private and final

// final class means we cannot inherit the class, 
// or the class does not have any child class
// final and abstract cannot be used together

// Abstract class has no meaning unless it is extended by its child class
// if a child class inherits a abstract class, it must override all the abstract methods
// otherwise we need to make the child class also abstract class.

public class Demo extends AbstractClasses{
	@Override
	public void funB() {
		System.out.println("Inside FunB of Demo");
		
	}
	
	public static void main(String[] args) {
		
		AbstractClasses d = new Demo();
		d.funB();
		d.funC();
	}

}
