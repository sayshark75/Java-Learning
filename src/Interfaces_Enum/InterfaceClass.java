package Interfaces_Enum;

// in Java there are 3 valid structures

// 1 - Normal or concrete class (Fully implemented structure) => Implemented? => method with body
// 2 - Abstract class (Partially implemented structure)
// 3 - Interface (fully unimplemented structure)


// as we extend a class inside another class, we implement an interface inside another class.
public class InterfaceClass implements Intr {

    // implementing an interface is a contract
    // we have to override all methods present in interface in the implementing class
    // or we can make this class abstract

    @Override
    public void funX() {
        System.out.println("Inside FunX in Interclass");
    }

    @Override
    public void funY() {
        System.out.println("Inside FunY in Interclass");
    }

    void intrFunA(){
        System.out.println("I am Root Method");
    }

    public static void main(String[] args) {
        // we can create an object for the override methods using Intr type
        Intr i1 = null;
        Intr i2 = new InterfaceClass();

        // Intr i3 = new Intr(); => Error

        // but cannot access root methods of InterfaceClass
        // i2.intrFunA(); => Error

        // we can access default methods of Intr Interface by Intr Reference as i2
        i2.funZ();

        // or my the same class Reference and same class Object who is implements the Intr interface
        InterfaceClass i3 = new InterfaceClass();
        i3.funZ();

        // to call the static method there is one way
        Intr.funT();


    }
}
