package AccessModifiers;

// it is a public class,
// can be accessed in any other class of any package
// to access outside a package, we have to import it

public class PublicClass {
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	// Default variable
	int d = 40;
	
	public void funA() {
		// inside a method, we can't declare another method 
		// and can't apply any access modifiers to a variable inside a method
		System.out.println("Inside public funA of Public Class");
	}
	
	private void funB() {
		System.out.println("Inside private funB of Public Class");
	}
	
	protected void funC() {
		System.out.println("Inside protected funC of Public Class");
	}
	
	void funD() {
		System.out.println("Inside Default funD of Public Class");
	}
	
	public static void main(String[] args) {
		PublicClass d1 = new PublicClass();
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
