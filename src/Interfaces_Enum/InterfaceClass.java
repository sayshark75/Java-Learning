package Interfaces_Enum;

// in Java there are 3 valid structures

// 1 - Normal or concrete class (Fully implemented structure) => Implemented? => method with body
// 2 - Abstract class (Partially implemented structure)
// 3 - Interface (fully unimplemented structure)


// as we extend a class inside another class, we implement an interface 
// inside another class.

// we also achieve Is-A Relation by implementing a interface
public class InterfaceClass implements Intr {

    // implementing an interface is a contract
    // we have to override all methods present in interface in the implementing class
    // or we can make this class abstract

	// the default access modifier is default for a method, if not given
	// void funX(){} is equivalent to default void funX(){}
	
    @Override
    public void funX() {
        System.out.println("Inside FunX in Interclass");
    }

    @Override
    public void funY() {
        System.out.println("Inside FunY in Interclass");
    }

    void intrFunA(){
        System.out.println("I am Inbuilt own Method of Interface Class");
    }

    public static void main(String[] args) {
        // we can create an object for the override methods using Intr type
        Intr i1 = null;
        Intr i2 = new InterfaceClass();
        // Intr i3 = new Intr(); // Compile time error

        // Intr i3 = new Intr(); => Error

        // but cannot access own methods of InterfaceClass
        // i2.intrFunA(); => Error
        
        // we have to downcast first, to access the specific members of 
        // the implementing class
        InterfaceClass ic = (InterfaceClass)i2;
        ic.intrFunA(); // own member
        ic.funX(); // overriden, but it is now its own method, as downcasted
        ic.funY(); // overriden, but it is now its own method, as downcasted
        ic.funZ(); // default from interface for the implementing class
        // also can access the static/non-static final variables
        System.out.println(ic.i);
        System.out.println(ic.j);

        // we can access default methods of Intr Interface by Intr Reference as i2
        i2.funZ();

        // or by the same class Reference and same class Object who is implements 
        // the Intr interface
        InterfaceClass i3 = new InterfaceClass();
        i3.funZ();

        // to call the static method there is one way
        Intr.funT();
        System.out.println("--------------------------");
        
        // we can also access the static, non-static variables from interface
        
        // by just the Interface reference, i1
        System.out.println("------------------------i1");
        // but not the methods
        // i1.funX(); // Runtime Error (NPE)
        // i1.funY(); // Runtime Error (NPE)
        // i1.funZ(); // Runtime Error (NPE)
        System.out.println(i1.i);
        System.out.println(i1.j);
        
        // by the (Interface reference and child object) i2 Object 
        System.out.println("------------------------i2");
        // will access the overridden, default methods, but not static methods
        i2.funX(); 
        i2.funY(); 
        i2.funZ();
        // i2.funT(); // Compile time error
        System.out.println(i2.i);
        System.out.println(i2.j);
        
        // by the object which implementing the interface, i3 Object
        System.out.println("------------------------i3");
        // will access the overridden, default methods, but not static methods
        i3.funX(); 
        i3.funY(); 
        i3.funZ();
        // i3.funT(); // Compile time error
        System.out.println(i3.i);
        System.out.println(i3.j);

    }
}
