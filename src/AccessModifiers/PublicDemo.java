package AccessModifiers;

//we can extend/inherit or create object of the Public class in other class of any package.

public class PublicDemo {
	public static void main(String[] args) {
		PublicClass d1 = new PublicClass();
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
