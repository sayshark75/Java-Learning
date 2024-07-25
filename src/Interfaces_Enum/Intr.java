package Interfaces_Enum;
// It is a Full Unimplemented structure in Java
// an Interface contains only abstract methods (methods without body) 
// and constant variables (public static final)
// till jdk 1.7, interfaces use to contains only abstract methods and final variables

// from jdk 1.8, we have special kind of methods in Interface which has body also 
// => Default and Static

// we cannot create an instance/object of an interface,
// we can create an object of concrete class who implementing this interface

// there is no constructor and its overloading concept in interface, hence no instance.

public interface Intr {
    // this var i is public static final by default, 
	// and must be initialized as it is a final variable
    int i = 10;
    public final int j = 20;

    // this unimplemented method funX and funY will be public and abstract by default
    void funX();

    void funY();

    // only Default and static methods are allowed with body

    // default method is automatically inherited to the implementing class
    default void funZ(){
        System.out.println("Inside intr default funZ");
    }
    // static methods are not Inherited to the implementing classes
    // it only be called by the interface.
    
    static void funT(){
        System.out.println("Inside intr static funT");
    }
}
