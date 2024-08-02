package AccessModifiers;

// we cannot extend/inherit or create object of the private class,
// in other class or in another package

public class PrivateDemo {
	public static void main(String[] args) {
		// we cannot access the Private class in same 
		// Package but different class
		// PrivateClass p1 = new PrivateClass();
		// System.out.println(p1.a);
		
		// but we can use static factory method to get the object
		// as shown below
		PrivateClass d1 = PrivateClass.getClassObject();
		System.out.println(d1.a);
		// b variable is private, only accessible in this same class
		// System.out.println(d1.b);
		System.out.println(d1.c);
		System.out.println(d1.d);
		
		d1.funA();
		// funB is Private, only accessible in this same class
		// d1.funB();
		d1.funC();
		d1.funD();
	}
}

//***************************************************************

// It is similar for outside of package,
// we cannot access the private class

//***************************************************************
