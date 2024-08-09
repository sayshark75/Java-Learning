package ExceptionHandling;

// User Defined Exceptions:

// --if we want we can create out own user-defined exception classes as well.
// we are inheriting/extends Exception class, so it becomes checked exception
// if we inherit/extends the RuntimeException class, then it will become unchecked
public class UserDefinedException extends Exception{
	// user can add a message
	public UserDefinedException(String message) {
		super(message);
	}
	
	// or without a message
	public UserDefinedException() {
		
	}
}
