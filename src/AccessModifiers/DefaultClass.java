package AccessModifiers;

// here we does not provide any access modifier keyword, 
// so it is default if not provided
// and this class only accessible in this package only
// in other packages, it acts as a private class

class DefaultClass {
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	// default variable
	int d = 40;
	
	public void funA() {
		// inside a method, we can't declare another method 
		// and can't apply any access modifiers to a variable inside a method
		System.out.println("Inside public funA of Default Class");
	}
	
	private void funB() {
		System.out.println("Inside private funB of Default Class");
	}
	
	protected void funC() {
		System.out.println("Inside protected funC of Default Class");
	}
	
	void funD() {
		System.out.println("Inside default funD of Default Class");
	}
	
	public static void main(String[] args) {
		DefaultClass d1 = new DefaultClass();
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
