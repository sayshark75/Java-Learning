package AccessModifiers;

// we cannot declare top level class as protected 
// but to keep this class as protected,
// we make its constructor to protected

public class ProtectedClass{
	// Constructor to be protected
    protected ProtectedClass() {
        System.out.println("ProtectedClass Constructor");
    }
    
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	// Default variable
	int d = 40;
	
	public void funA() {
		// inside a method, we can't declare another method 
		// and can't apply any access modifiers to a variable inside a method
		System.out.println("Inside public funA of Protected Class");
	}
	
	private void funB() {
		System.out.println("Inside private funB of Protected Class");
	}
	
	protected void funC() {
		System.out.println("Inside protected funC of Protected Class");
	}
	
	void funD() {
		System.out.println("Inside Default funD of Protected Class");
	}
	// main method outside protected class
	public static void main(String[] args) {
		// inside the same class we can create its object
		// and access members of it
		ProtectedClass d1 = new ProtectedClass();
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

