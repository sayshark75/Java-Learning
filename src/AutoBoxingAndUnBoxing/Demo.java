package AutoBoxingAndUnBoxing;

public class Demo {
	public static void main(String[] args) {
		// AutoBoxing :
		// auto boxing is a new concept introduced in java 1.5 onwards,
		// it means that the primitive dataType will automatically converted to
		// respective Wrapper classes
		// for example: 
		int x = 10;
		// before java 1.5 we does this
		Integer i2 = Integer.valueOf(x);
		
		// but from the autoBoxing concept we can simply write
		
		Integer i3 = x;
		
		// AutoUnBoxing :
		// it is a simple reverse process of autoBoxing
		// for example:
		int x2 = i2;
		int x3 = i3;
		
		// Similarly it works for other Primitive Data Types
		
		
	}
}
