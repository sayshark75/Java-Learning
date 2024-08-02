package Enums;

// to create own data type which allows certain set of values, we use ENUMs
// ENUMs introduced in java 1.5
// Every Enum constant is implemented by using class concept
// Every Enum constant is public static final
// Every Enum constant represents an object of the type enum
// java.lang.Enum class is an Abstract class
// Inheritance/Extends concept is not applicable with Enum (No Is-A Relation)
// but an enum can implement any number of interfaces
// unlike other languages, Enum in JAVA is more powerful
// because we can have variables, methods even constructors inside an Enum
// also we can overload methods and constructors

// to create some constant values, we use Enums
// we can separately create it and use it in different classes

public enum Color {
	// to execute the overloaded constructor we will parameterize the enum values
	// these values are objects which instantiated one by one with the abstract Enum class.
    RED,GREEN(44),YELLOW,PINK(20);
	
	// the Above Enum willl be converted internally as follows
	// final class Color extends Enum{
	//	public static final Color RED = new Color();
	//  public static final Color GREEN = new Color();
	//  public static final Color YELLOW = new Color();
	//  public static final Color PINK = new Color();
	// }
	
	// Constructor in Enums
	// We can place a constructor inside a enum, that constructor can only be private
	
	// Constructor
	// by default compiler will make it private(no object outside this class)
	private Color() {
		// a constructor of enum will be executed separately for every enum constant
		// at the time of enum class loading into the memory
		System.out.println("Inside Constructor of Colors Enum"); // printed 4 times
	}
	// constructor overloading
	private Color(int i) {
		System.out.println("Inside Constructor of Colors Enum"+ " : number : "+i);
	}

    // we can add methods, variables and constructor
     public void enumMethod(){
        System.out.println("Inside Enum Method");
    }
    static int enumVal = 20;
    
    public static void main(String[] args) {
    	// values() method : this method will return all the values 
    	// in the form of an array
    	// it is a static method which we can call on any Enum.
    	Color[] colors = Color.values();
    	
    	for(Color color:colors) {
    		// ordinal() method : by using this we can get the Index of 
    		// the value(zero based index) 
    		// it is a non static method
    		System.out.println(color + "----------"+color.ordinal());
    	}
    	
    	// We can access the methods using the objects instantiated by the abstract class
    	Color c2 = Color.RED;
    	Color c3 = Color.GREEN;
    	
    	c2.enumMethod();
    	c3.enumMethod();
	}
}
