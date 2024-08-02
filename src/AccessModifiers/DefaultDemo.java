package AccessModifiers;

// we can inherit or create object of the Default class in other class of same package.

public class DefaultDemo extends DefaultClass{
	public static void main(String[] args) {
		DefaultClass d1 = new DefaultClass();
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
