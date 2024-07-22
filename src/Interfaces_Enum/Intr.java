package Interfaces_Enum;

// an Interface contains only abstract methods (methods without body) and constant variables (public static final)
// from java-1.8, we have special kind of methods in Interface which has body also => Default and Static

// we cannot create an instance/object of an interface,
// we can create an object of concrete class who implementing this interface

public interface Intr {
    // this var x is public static final by default
    int x = 10;

    // this method funX and funY will be public and abstract by default
    void funX();

    void funY();

    // only Default and static methods are allowed with body

    // default method is automatically inherited to the implementing class
    default void funZ(){
        System.out.println("Inside intr default funZ");
    }
    // static methods are not Inherited to the implementing classes
    static void funT(){
        System.out.println("Inside intr static funT");
    }
}
