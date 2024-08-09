package ExceptionHandling;



public class ThrowsInConstructor {
	
	// we can add a throws keyword to the constructor as well
	public ThrowsInConstructor() throws Exception {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Start of main method...");
		
		// here we need to add this instantiation in try-catch block
		// because the exception it has is checked exception
		// you can try changing Exception to Arithmetic Exception which 
		// is unchecked exception
		
		try {
			ThrowsInConstructor t1 = new ThrowsInConstructor();
		}catch(Exception e){
			System.out.println("Catched Constructor Exception");
		}
		
		
		
		
		System.out.println("End of main method...");
	}
}
