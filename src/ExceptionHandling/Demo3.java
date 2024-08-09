package ExceptionHandling;

// logical errors are also of two types:

// l - simple logical error : - these logical error are permitted to handle. 
// they are the child of Exception classes

// 2 - serious logical error : - these logical errors are not permitted to handle, 
// they are the child class of Error class.
// ex: 

// while(true){
// A a1 = new A(); // repeatedly creating new object, consuming memory
// }

//--the classes which represents the simple logical error comes under the 
// Exception class whereas the classes which represents the serious logical 
// error comes under the Error class.

//--catch block is designed in such a way that it can take only the object 
// of Throwable class and its child classes.

// in java we have all together 5 keywords in the concept of exception handling:
// l.try
// 2.catch
// 3.throw
// 4.throws
// 5.finally

// --Exception classes are categorized in 2 category:
// l.checked exception (checked by java compiler whether we have handled that 
// exception or not )

// 2.unchecked exception (not checked by the compiler)

// ***Note: whether exception is checked or unchecked, exception always 
// occurs at runtime. it never occurs at compile time. 
// compile time only occurs compilation error.

// kid ------> mother -------- > exam
// .java-----> java compiler --------> .class ------->jvm------->execute the class

// responsibility of java compiler:

// 1. convert .java(source code) to the .class(bytecode)

// 2. if inside the class if we don't put any constructor then it provides 
// the default constructor inside our .class file

// 3. it will scan our .java file and check any kind of syntax error . 
// and generate compile time error.

// 4. for each and every statement which may generate an exception, 
// compiler will check whether we are handling the corresponding exception 
// class object or not.

// --in the process of checking, compiler will not bother even we don't handle 
// object of some exception classes.

// --but there are some statements for which applying the concept of exception 
// handling is mandatory at compile time itself.
// if we don't handle them then compiler will generate a compile time error.

// the exception class object for which compiler force us to handle them 
// at compile time only are known as checked exception

// ex:
// ClassNotFoundException
// IOException
// SQLException

// and for those exception classes compiler will not force us 
// (it ignores) at compile time to handle are known as unchecked exceptions:
// ex: AE, NPE, NFE, CCE, AIOBE

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
//   (Unchecked)
//		|
//	-------------------------
//  |		|		|		|
//  AE	   NPE	   NFE	   etc

// RuntimeException and its child classes considered as unchecked exception 
// (runtime exceptions)
//--if some statement in our java code may generate these classes object, 
// handling these classes object at compiler time is optional.

//Exception class and its child class except RuntimeException class is known
// as checked exception,
// --if some statement in our java code may generate these classes object, 
// handling these classes object at compile time is mandatory, otherwise compiler
// will generate compile time error.

public class Demo3 {
	public static void main(String[] args) {
		
	}
}
