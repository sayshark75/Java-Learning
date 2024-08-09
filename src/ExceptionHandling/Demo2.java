package ExceptionHandling;

// here we can see there might be at least 3 Exceptions there

public class Demo2 {
	
	
	public static void main(String[] args) {
		System.out.println("Start of Main method...");
		try {
		// if i add wrong value in the string which expecting number here
		// will cause NumberFormatException in the parseInt 
		// method of Integer wrapper class
		String s1 = "100 ";
		
		String s2 = "10";
		
		A a1 = null;
		
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		// if the string value s2 is 0, then parsed num2 value will be 0
		// it will cause ArithmaticException because of / by zero
		int z = num1/num2;
		
		if(z>5) {
			a1 = new A();
		}
		// if the z value is becomes less than 5, then the a1 object remains null, 
		// and cause NullPointerException
		a1.funA();
		
		// Advantage of below multiple catch approach:
		// --we have specific way to handle each type of exception, we can write
		// alternate logic for each type exception
		
		}
		// catch(ArithmeticException ae) {
		//	System.out.println("Inside AE");
		// }
		// catch(NullPointerException npe) {
		//	System.out.println("Inside NPE");
		// }
		// catch(NumberFormatException nfe) {
		//	System.out.println("Inside NFE");
		// }
		
		// we can also use | to do a multi-catch block like below
		catch(ArithmeticException | NullPointerException | NumberFormatException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		// Disadvantages of multiple catch blocks:
		// 1. developer should have through knowledge about which statement
		// may throw which type of exception, which may not possible always.
		// 2.writing too many catch block is also not feasible.
		
		// solution to the disadvantage
		
		// Hierarchy of a Exception
		
		// 				Object
		//				  |
		//			  Throwable
		//				  |
		//	    -------------------------------------------------------
		//		|													  |
		//	Exception (Checked Exception) 				 			Error
		//		|
		//		---------------------------------------------
		//		|				|			  |			    |
		// RuntimeException	  SQLExc	ClassNotFoundExc   etc.
		//		|
		//	-------------------------
		//  |		|		|		|
		//  AE	   NPE	   NFE	   etc
		// ** Exception class is the super class of all the exception classes.
		// all the above classes belongs to java.lang package.
		// 
		catch(Exception e) {
			// 1000 statements we can write here
			// but in this 1000 statements, there might be another exception come
			// so we can also add nested try-catch block
			System.out.println(e);
			System.out.println("Inside Exception e");
			System.out.println(e.getMessage());
			// if we want where the error occurred in the hierarchy, we use
			e.printStackTrace();
		}	
		
		// Rule with multiple catch block:
		// -- siblings can be in any order but parent must be the last
		
		System.out.println("End of Main method...");
	}
}
