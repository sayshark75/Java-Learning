package ExceptionHandling;

// we can nest multiple try-catch block inside a try-catch block
// we can add it in try block and also in catch block


public class Nesting {
	public static void main(String[] args) {
		System.out.println("Start of main method...");
		
		
		try {
			System.out.println("Inside Try 1");
			System.out.println(100/10);// if error occurred here
			// then the execution stop here and go to catch block 1
		
			try {
				System.out.println("Inside Try 2");
				A a1 = null;
				a1.funA();// if error occurred here
				// then the execution stop here and it go to catch block 2
				
				System.out.println("End of try 2");
				
				// if the given exception is not match with the exception object in catch
				// then the object thrown to the parent block and so....on
			}catch(NullPointerException npe) {
				System.out.println("Catch of try 2");
			}
		System.out.println("End of try 1");
		}catch(Exception e) {
			System.out.println("catch of try 1");
		}
		
		System.out.println("End of main method...");
		
	}
}
