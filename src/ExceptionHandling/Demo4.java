package ExceptionHandling;

// in error handling there are 5 keywords
// try
// catch
// throw
// throws
// finally

// throw keyword :
// --with throw keyword we can generate the exception class object in 
// our program explicitly.

// --generally jvm will create the exception class object, whenever logical 
// error occurs in our application. and put/throw that exception obj inside 
// our application.

// --but sometime, it is required that programmer need to create the exception 
// class object explicitly and throw that inside the application manually. 
// whenever logical error occurs due to the business logic violation.

// --this business logic violation error related logical error, is not a 
// logical error to the point of view of jvm.

// throws keyword:
// --this keyword is used along with method signature to announce the caller
// that the method might throw an exception class object at calling place.

public class Demo4 {
	// throws keyword: used to indicate, this method might throw an ArithmeticException
	// we can add multiple exceptions using comma
	// also we can add the parent RuntimeException class or its parent Exception class
	public int getPension(int age, int salary) throws ArithmeticException {
		int pension = 0;
		if(age > 40 && age < 100)
			pension = (age * salary)/100;
		else {
			// this exception is generated based on logic error due to our business logic
			ArithmeticException ae = new ArithmeticException("Invalid Age") ;
			throw ae;
			// remaining statements are terminated
		}
		return pension;
	}
	
	// specifying unchecked exception using throws keyword is optional
	// but must specify the checked exception (Mandatory), 
	// try removing throws in getPension and in getMoney methods
	public int getMoney(int age, int salary) throws ClassNotFoundException {
		int pension = 0;
		if(age > 40 && age < 100)
			pension = (age * salary)/100;
		else {
			// this exception is generated based on logic error due to our business logic
			ClassNotFoundException ae = new ClassNotFoundException("Invalid Age") ;
			throw ae;
			// remaining statements are terminated
		}
		return pension;
	}
	
	public int getCash(int age, int salary) throws UserDefinedException  {
		int pension = 0;
		if(age > 40 && age < 100)
			pension = (age * salary)/100;
		else {
			// this exception is generated based on logic error due to our business logic
			// but it is not a valid exception aligning with our pension error
			// so we created a checked UserDefinedExeption to handle This
			UserDefinedException ae = new UserDefinedException("Invalid Age") ;
			throw ae;
			// remaining statements are terminated
		}
		return pension;
	}
	
	// main method is the caller of the getPension or getMoney method
	public static void main(String[] args) {
		System.out.println("Start of main");
		Demo4 d = new Demo4();
		// so we will get the method signature with which exception it can throw here
		// so we can use try catch block to prevent it
		// checked exceptions are must be handled using try catch blocks
		// uncomment and hover over it.
		// d.getMoney(45,2000);
		try {
			int result = d.getPension(10, 20000);
			System.out.println("Result : "+result);
		}catch(ArithmeticException ae) {
			System.out.println("Inside Catch block");
			System.out.println(ae.getMessage());
		}
		try {
			// handled a checked exception
			int cash = d.getCash(10,20000);
		} catch (UserDefinedException e) {
			e.printStackTrace();
		}
		System.out.println("End of main.....");
	}
	
	//Rule - 1:
	// --if we are throwing any unchecked exception class object from a method 
	// then announcing that exception with method signature is optional. 
	// otherwise (if we throw any checked exception class object) then it is mandatory.
	
	// Rule - 2:
	// --if a method throws any checked exception then caller have two choices at compile time.
	//		l.caller need to wrap the method call inside the try-catch block 
	//		(handle the exception)
	//		2.caller can delegate the exception handling duty to its own caller method
	//		by using "throws" keyword (skipping the exception handling duty)
	
	// *** Note: we only handle the exception using try-catch block, using throws 
	// keyword we just skip the exception handling duty and delegate it to the caller.
	
	// --we can apply the throws keyword with the main method also, but in 
	// real time application it is never recommended to use throws along with 
	// main method. because by doing so, we are ready to accept abnormal termination.
	
	//Note: whenever we want to make exception handling duty mandatory to the
	// caller then throw the checked exception class object otherwise 
	// (if we make exception handling duty to caller is optional) then throw the
	// unchecked exception.
	
	
}
