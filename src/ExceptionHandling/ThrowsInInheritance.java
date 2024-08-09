package ExceptionHandling;


// here we inheriting/extending a class with a Exception in its constructor
// here we explicitly create a constructor which has to mention which Exception is there
// inherited

public class ThrowsInInheritance extends ThrowsInConstructor{

	// now we are passing the Exception in this child class to a caller of
	// this constructor
	public ThrowsInInheritance() throws Exception {
		super(); 
	}
	
	// or we can not resolve the Exception here itself by doing this
	//	public ThrowsInInheritance(){
	//		try {
	//			// super(); must be the first statement in constructor
	//			super();
	//		}catch(Exception e) {
	//			
	//		}
	//	}
	
	
	public static void main(String[] args) {
		System.out.println("Start of main method...");
		
		try {
			ThrowsInInheritance t1 = new ThrowsInInheritance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("End of main method...");
	}
	
}
