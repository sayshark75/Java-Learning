package ExceptionHandling;

// finally:
// --irrespective of try and catch if we want to execute some code then we 
// can use finally block.

// --it is block used with try and catch block.

// -- we can use a try block without catch if we use try-finally
// but it is not recommended approach and should be avoided

// finally block is simply for executing some code whether the exception
// occurred or not, so basically if we use try-finally then it simply means
// we are executing a code block when in Exception

// For Example in a Server, we connect to a Database, and the DB allows only 10 
// Connections, and in our code we connect to DB then perform some operation on DB 
// and then close the connection

// but if there is any exception occurred or not, connection must be closed
// in this scenarios we use finally block

public class FinallyClass {
	public static void main(String[] args) {
		System.out.println("Start of main method...");
		
		try {
			// connect to DB, 
			System.out.println("Connected to DB");
			// connection kept outside, so it will be a local to try-catch
			
			try {
				System.out.println("Inside Try Block");
				
				// Perform our business logic
				System.out.println("Performing Business Logic");
				System.out.println(100/0);// Arithmetic Exception
				// but if the Exception happen, connection is still connected
				// so we will move the peration in Finally block
				
				System.out.println("End of Try Block");
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());;
				System.out.println("Inside Catch Block");
			}finally{
				// close the connection from DB
				System.out.println("DB Connection Closed");
				// whether the Exception occurred or not, we will execute the finally block
				System.out.println("Inside Finally Block");
				
				// we can use try-catch as well here
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("End of main method...");
	}
}
