package Interfaces;
// It is a Full Unimplemented structure in Java
// an Interface contains only abstract methods (methods without body) 
// and constant variables (public static final)
// till jdk 1.7, interfaces use to contains only abstract methods and final variables

// from jdk 1.8, we have special kind of methods in Interface which has body also 
// => Default and Static

// we cannot create an instance/object of an interface,
// we can create an object of concrete class who implementing this interface

// there is no constructor and its overloading concept in interface, hence no instance.

// interface can not extends another class (Normal class, concrete class, fully implemented class) 
// and can not implements any interface also.
// Interface can Inherit (extend) another Interface 
// also can be extend multiple interfaces using comma

public interface Intr {
    // this var i is public static final by default, 
	// and must be initialized as it is a final variable
    int i = 10;
    public final int j = 20;

    // this unimplemented method funX and funY will be public and abstract by default
    void funX();

    void funY();

    // only Default and static methods are allowed with body
    
    // ***but why we need the default methods?
    
    // ==> we know that the interface can me implemented by many classes, 
    // suppose 100 classes implementing this Interface,
    // and in future i want to add a new method in it, 
    // if i add, what will happen? => the other implementing classes starts complaining
    // that they need to override new added method, so either we can override for 100 classes
    // or make the method as default, thats why we have this default feature
    
    // we can also override the method in other implementing classes which require its own method body 
    
    // *************************Summary of Default Methods **************************
    // we can define a default method with the body inside an interface.
    // this default method need not override inside the implementation classes.
    // these default method are by default inherited inside the implementation classes.
    // we can call these default method from any implementation class object.
    // if we want, we can override this default method inside the implementation classes.
    // does not need default keyword while overriding
    // *********************************************************************************
    
    // default method is automatically inherited to the implementing class
    default void funZ(){
        System.out.println("Inside intr default funZ");
    }
    
    //***********************Summary of Static Methods ****************************
    // We can also define a static method inside an interface.
    // this static method must have body.
    // static method of an interface will not be inherited inside the implementation class.
    // so we can not call this static method of an interface by using implementation class object.
    
    // Note: we can call the static method of an interface only by using interface name.
    
    // Note: we can define same method as static or non-static inside the implementation class also, 
    // which is already defined statically inside the interface, 
    // (this is called as method hiding not method overriding)
    // ******************************************************************************
    
    // static methods are not Inherited to the implementing classes
    // it only be called by the interface.
    
    static void funT(){
        System.out.println("Inside intr static funT");
    }
    
    // we can run an Interface as well using the static main method from java 1.8 onwards
    public static void main(String[] args) {
		System.out.println("Inside Mainof Intr Interface");
		
	}
}
