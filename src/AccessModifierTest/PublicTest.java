package AccessModifierTest;

// to access in another class of other package, 
// we have to import the PublicClass first
import AccessModifiers.PublicClass;

public class PublicTest extends PublicClass {
	public static void main(String[] args) {
		PublicClass d1 = new PublicClass();
		System.out.println(d1.a);
		// b variable is private, we can't access here
		// System.out.println(d1.b);
		
		// in a different package, we can't access a protected field
		// System.out.println(d1.c);
		
		// in a different package, we can't access a default field
		// System.out.println(d1.d);
		
		d1.funA();
		// funB is Private, we can't access here
		// d1.funB();
		
		// in a different package, we can't access a protected method
		// d1.funC();
		
		// in a different package, we can't access a Default method
		// d1.funD();
	}
}
