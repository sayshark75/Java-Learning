package AccessModifiers;

// we cannot declare top level class as private
// but to prevent this class not to be inherited 
// or neither its object to be created
// we will make its constructor as private
// as we know the compiler will create a default constructor with public access Modifier
// we will overload it with our own constructor

public class PrivateClass{
	
	private PrivateClass() {
		System.out.println("PrivateClass Constructor");
	}
	
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	// Default variable
	int d = 40;
	
	//  ****** A Static Factory method
	// used to get object of this class in another class
	public static PrivateClass getClassObject() {
		// possible values we can return are
		// 1 - null
		// 2 - PrivateClass
		// 3 - PrivateChildClass, which is not possible for private class
		return new PrivateClass();
	}
	
	public void funA() {
		// inside a method, we can't declare another method 
		// and can't apply any access modifiers to a variable inside a method
		System.out.println("Inside public funA of Private Class");
	}
	
	private void funB() {
		System.out.println("Inside private funB of Private Class");
	}
	
	protected void funC() {
		System.out.println("Inside protected funC of Private Class");
	}
	
	void funD() {
		System.out.println("Inside Default funD of Private Class");
	}
	
	public static void main(String[] args) {
		// we can create a object of this class in the same class only
		// not outside of the class and neither outside of the package
		
		PrivateClass d1 = new PrivateClass();
		System.out.println(d1.a);
		// b variable is private, only accessible in this same class
		System.out.println(d1.b);
		System.out.println(d1.c);
		System.out.println(d1.d);
		
		d1.funA();
		// funB is Private, only accessible in this same class
		d1.funB();
		d1.funC();
		d1.funD();
	}
} 
