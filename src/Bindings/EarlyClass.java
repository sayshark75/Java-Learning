package Bindings;

// static polymorphism:
// method overloading: which method will be called decided at compile time.

// early binding/static binding: type of the object and method body to the method call 
// determined at compile time.

public class EarlyClass {
	
	// here two methods which are overloaded, but in Early binding it 
	// will decide which method body will be executed while compiling this class.
	
	// Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public void sayHello(EarlyDemo demo) {
    	// Here the EarlyDemo class is not Inherited by any Other class
    	// so there is no chance of Overriding,
    	// thats why Early binding happens here
    	System.out.println("Hello, " + demo.getName() + "!");
    }
    
    public static void main(String[] args) {
		EarlyClass e1 = new EarlyClass();
		
		// which method body needs to be executed is already decided
		// it will execute the body which has three integers as parameters
		System.out.println(e1.add(10, 20, 30));
		
		// the myth is wrong that a method which takes another class object as a parameter
		// will be considered late binding
		// here we will show early binding with another class object and its method
		
		EarlyDemo d1 = new EarlyDemo("Doraemon");
		EarlyClass e2 = new EarlyClass();
		
		e2.sayHello(d1);
	}
}
