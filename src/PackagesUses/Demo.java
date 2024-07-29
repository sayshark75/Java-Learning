package PackagesUses;

// Every Package is a folder but reverse is not true

// if we know which one to import we can specifically import that class
// import com.packageTest.ImportThisClass;
// or **************************
// sometimes there will be a lot of classes in you package,
// and you can't be import each class one by one
// then this will import just the required classes which is used in our class
 import com.packageTest.*;

// We Use Packages to bind/group the related concept logically
// example : java.io => classes and interface related to IO operations
// java.util => classes and interface related to utils like scanner
// java.lang => all common classes like wrapper classes, object class, etc

// we should start our application using package keyword first

// there are 3 uses of packages in java
// 1 - we can bind/group the related concept logically
// 2 - Avoid the naming conflict
// 3 - to provide some level of security (with respect to Access Modifiers)

// Package Naming convention is Reverse domain name 

// Full Qualified class name: the package it belongs
// String => java.lang.String

public class Demo {
	
	// we can refer the Test class from our Package "PackageUses"
	Test t1 = new Test();
	
	// but what if we want to access the Text class from "com.packageTest"
	// we either have to use fully qualified name to either t1 Reference ^^^^
	// or to the t2 reference as shown below
	com.packageTest.Test t2 = new com.packageTest.Test();
	PackagesUses.Test t3 = new PackagesUses.Test();
	
	// currently we are not imported anything, 
	// but to import we just use the import keyword and package name at top of class
	ImportThisClass i1 = new ImportThisClass();
	
	// importing from com.packageTest
	Unnecessary u1 = new Unnecessary();	
	
	// Which approach we use?
	// if we use fully qualified name, then it make low confusion about
	// where the Class coming from, else we use 
	
	public static void main(String[] args) {
		System.out.println("*******Welcome In Packages*******");
	}
	
	
	
}
