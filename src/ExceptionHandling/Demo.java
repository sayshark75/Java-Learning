package ExceptionHandling;

// Exception Handling:
// there are two types of error in java
// l - syntax error:- improper environment (ex: missing class) and 
// syntactical error (ex: syntax mistakes).
// it results in compilation error.

// 2 - logical error:- sometime jvm would be unable to execute statements in the 
// byteCode due to some logical error occur in our program.

// --whenever a logical error occurs in our application, jvm will terminate the 
// program abnormally, and control comes out from the program unconditionally 
// without executing remaining statements.

// --normal termination or graceful termination of our application:- whenever last
// line of the main method or any class will be executed successfully then we can
// conclude ,our application terminated gracefully or normally.

// for each logical error, there are some predefined classes in java, whose objects
// are created by the jvm , whenever it encounters that corresponding logical error. 
// names of such classes found under the Exception class in java api.

// ex:-
// java.lang.ArithmaticException
// java.lang.ArrayIndexOutOfBoundException
// java.lang.NullPointerException
// java.lang.ClassCastException
// java.lang.NumberFormatException
// java.io.IOException
// java.sql.SQLException
// etc..

// -- whenever jvm encounters a logical error, it creates an object of the 
// corresponding predefined exception class, and put that object in our application,
// if we don't handle that object explicitly , this object will reaches back to 
// the jvm, then jvm will receive that object and terminates the program abnormally.

//to avoid the abnormal termination, we need to avoid that exception class object 
// should not reach back to the jvm, and we do so by handling that exception class object.

// we handle the exception class object by just assigning that object to the 
// corresponding exception class variable.

// we have 2 keyword try and catch to implements exception handling.

// try keyword will recognize the exception class object created by the jvm
// and it gets hold on that object and transfer that object to the catch block.

public class Demo {
	public static void main(String[] args) {
		System.out.println("Start of main...");
		
		int x = 100;
		int y = 20; // normal or graceful execution or termination		
		
		int z = x/y;
		System.out.println("The Result of z is: "+z);
		
		// as here is an error occured in runtime, we use try and catch block
		
		try {
			int a = 200;
			// int b = 10; // if no logical error, then only try block will execute
			int b = 0;
			int c =a/b; // no compile error, but an exception of logical error (Divide by Zero)
			// as error occur above, no following statements will be executed
			// execution control will be passed to catch block
			System.out.println("The Result of c is: "+c);
			
			// we have to catch the Exception Object so it would not return to JVM Again
		}catch(ArithmeticException ae) {
			// what we have to do , we can write here
			// maybe some toast or popups triggered in android
			System.out.println("Error: Inside Catch Block AE");
			System.out.println(ae.getMessage());
			// we can add multiple catch blocks to catch different errors
		}catch(NullPointerException ne) {
			System.out.println("Error: Inside Catch Block of NPE");
			System.out.println(ne.getMessage());
		}
		
		
		System.out.println("End of main");
	}
	
	// Summary points
	// l. the main objective of exception handling is normal/ graceful termination
	// of the program.
	
	// 2. we can know in which part of the program the logical error has occurred.
	
	// 3. we are not allowing the jvm to terminate the entire application, only 
	// the try block in which the logical error has occurred would be terminated.
	
	// 4. if no exception class object is created inside the try block , control 
	// will never enters to the catch block.
	
	// 5. once the control enters in the catch block, it executes the statements in 
	// the catch block and moves further. it will not come to the try block again, 
	// because of which the catch block has executed.
	
	// 6. every try block should be associated with at least one catch block.
	
	// Note:- in a catch block ,we not only handle the exception class object 
	// to the corresponding variable, in addition to that, catch block provides 
	// an alternate way to define the logic whenever any exception occurred 
	// inside the try block.
}
