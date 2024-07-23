package Polymorphism;
// we will be see how upcasting happen, and why we downcast it
public class UpCasting {
	// here function doing upcasting, 
	// whatever the object we return will be of Referenced by Object
	// this is the upcasting scenario, which might happen.
	public Object fun1(int a) {
		if(a>10) {
			return new SubCast1();
		}else if(a>5 && a<=10) {
			return new SubCast2();
		}else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		// we just create an object of the UpCasting Reference
		// with the same Object
		
		UpCasting u1 = new UpCasting();
		// heere i passed 3, so we will get back null (Default value)
		// but body is not visible to us sometimes, but the return type does.
		// so we will catch or hold it in Object class as reference
		
		Object obj = u1.fun1(13);
		// but we can't call the methods in null value, its simply give NPException
		// the next statements will not execute
		// obj1.funX();
		
		// but then how to prevent such behaviors?
		// we can use conditions
		
		if(obj != null) {
			// but still we are confused which object is it?
			// we have to downcast it
			// but still how we will know on which child reference we have to downcast?
			// we can use InstanceOf operator
			
			if(obj instanceof SubCast1) {
				// Object Downcasting
				SubCast1 s1 = (SubCast1)obj;
				s1.funX();
			}else {
				SubCast2 s2 = (SubCast2)obj;
				s2.funY();
			}
		}else {
			System.out.println("The Object is Null, please provide value above 5");
		}
		
		
		
		
	}

}
