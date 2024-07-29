package Bindings;

//dynamic polymorphism:
//method overriding: which method will be called decided at runtime

//late binding/dynamic binding: type of object and method body to the method call 
//determined at runtime.

//if the method body is binded with the method call at runtime then it is called late binding.

public class LateClass {

    // Method to call displayMessage using LateDemo (class-based)
    public void callDisplayMessage(LateDemo lateDemo) {
    	// Here we are using LateDemo as Reference, but we know that
    	// the values will come as params may be the same class Object
    	// maybe the child class (ChildLateDemo) which inheriting this class LateDemo
    	// maybe the grandChild class which inheriting the class ChildLateDemo
    	// so.....on
    	// maybe null
    	// so thats why late binding happens
        lateDemo.displayMessage();
    }

    // Method to call displayMessage using LateInterface (interface-based)
    public void callDisplayMessage(LateInterface lateInterface) {
    	// Here we are using Interface as param,
    	// but we know that we can only create object of the class which is implementing
    	// the interface with the actual Interface Reference or null
    	// so for sure we have a overridden method to be executed
    	// but we also not sure how many classes going to implement this Interface
    	// thats why late binding happens
        lateInterface.displayMessage();
    }

    public static void main(String[] args) {
        LateClass lateClass = new LateClass();

        //***************************************************
        // Class-based late binding
        
        // here ChildDemo class is Inheriting the LateDemo Class and Overriding 
        // the displayMessage Method
        LateDemo demo = new LateDemo();
        LateDemo childDemo = new ChildLateDemo();
        // thats why, in both below invocations, Late binding happens
        lateClass.callDisplayMessage(demo);       // Output: Hello from LateDemo!
        lateClass.callDisplayMessage(childDemo);  // Output: Hello from ChildLateDemo!

        //***************************************************
        // Interface-based late binding
        
        // Here we are using LateInterfaceImpl class which is
        // Implementing the LateInterface Interface
        // so the class has to override methods inside Interface
        // thats why the Late Binding Happens
        LateInterface interfaceImpl = new LateInterfaceImpl();
        lateClass.callDisplayMessage(interfaceImpl);  // Output: Hello from LateInterfaceImpl!
    }
}