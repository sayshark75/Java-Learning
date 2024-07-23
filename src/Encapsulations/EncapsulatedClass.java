package Encapsulations;

// Beans class: its a class which is used for Encapsulation
// the class is public, its members are private, and getter-setters are
// public, so user will only access required data, and methods too

public class EncapsulatedClass {
	
	private int roll;
	private String name;
	private int marks;
	
	// the constructor must be zero argument constructor for a Bean class
	// public EncapsulatedClass() {}
	// compiler will provide Default constructor if there is no Constructor
	// you can create your constructor with parameters
	
	public EncapsulatedClass(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "EncapsulatedClass [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
