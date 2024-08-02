package AccessModifiers;

// we can access the Protected class in another class of same package
// can create its object or inherit it as well
// but outside of that package, we just able to inherit it,
// not able to create its object in other package

public class ProtectedDemo extends ProtectedClass {
	public static void main(String[] args) {
		// we can access a protected class in other class
		// so can create any object and view any member of that class
		// also we can inherit that class
		ProtectedClass p1 = new ProtectedClass();
		System.out.println(p1.a);
		// b variable is private, we can't access here
		// System.out.println(p1.b);
		System.out.println(p1.c);
		System.out.println(p1.d);
			
		p1.funA();
		// funB is Private, we can't access here
		// p1.funB();
		p1.funC();
		p1.funD();
		System.out.println("*************************************");
		ProtectedDemo d1 = new ProtectedDemo();
		System.out.println(d1.a);
		// b variable is private, we can't access here
		// System.out.println(d1.b);
		System.out.println(d1.c);
		System.out.println(d1.d);
			
		d1.funA();
		// funB is Private, we can't access here
		// d1.funB();
		d1.funC();
		d1.funD();
	}
}
