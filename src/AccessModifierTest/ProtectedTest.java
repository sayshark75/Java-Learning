package AccessModifierTest;

// we have to import the Top Class first
import AccessModifiers.ProtectedClass;

// we cannot access the protected class in a class which 
// is outside of a package as a object(cannot instantiate it)

// but we can access its non-default and non-private members 
// only by inheriting that class
// for accessing default members, we need to create that class object
// which is not possible here for protected class

public class ProtectedTest extends ProtectedClass {
	public static void main(String[] args) {
		// we cannot access the protected class members using its object
		// ProtectedClass t1 = new ProtectedClass();
		
		// but we can access the member of protected class using Inheritance
		// by extending the protected class, and creating object of this class
		ProtectedTest d1 = new ProtectedTest();
		System.out.println(d1.a);
		// b variable is private, we can't access here
		// System.out.println(d1.b);
		System.out.println(d1.c);
		// d variable is Default, we can't access here
		// System.out.println(d1.d);
		
		d1.funA();
		// funB is Private, we can't access here
		// d1.funB();
		d1.funC();
		// funC is Default, we can't access here
		// d1.funD();
		
	}
}
