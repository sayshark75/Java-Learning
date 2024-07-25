package InstantiationClass;

// Method hiding applies only to static methods. Instance methods are subject to overriding.

// static methods does not participate in method overriding(not participate in inheritance)
// We can override static methods but it is not recommended

// this concept called method hiding, 
// where the static method purly belongs to the child class only.
// here we will extend the A class which has 3 static and 2 non-static methods

public class MethodHiding extends A {
	@Override
	void funB() {
		System.out.println("Inside FunB of MethodHiding");
	}
	// without any override annotation, we can use it
	// but it is only belongs to this child class.
	// but it is not actual override so that why the override annotation gives error
	// this is method hiding, 
	// where the static method funA of A class is hided by the funA of this child class
	static void funA() {
		System.out.println("Inside FunA of MethodHiding");
	}
	
	public static void main(String[] args) {
		MethodHiding m1 = new MethodHiding();
		m1.funB();
		// funA is only belongs to this class, child class only
		m1.funA();
		MethodHiding.funA();
		A.funA();
	}
	
}
