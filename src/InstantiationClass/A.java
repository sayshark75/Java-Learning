package InstantiationClass;

// how a object is created, learn in deep level
// in this class there are 3 static members
// int j, funA, and main
// this all will be loaded in context area of ram by jvm
// and then the jvm will locate the main method in the class
// and execute the class
// as the static members loaded, we can access them directly inside main method
// because there reference is in the context.

// but we can't able to access the non-static methods, why?
// because they are still in the hard disk, and not loaded yet.
// to load them we have to create an instance of the class (an Object)
// so we do this inside main method mostly `A a1 = new A();`
// here new keyword will create a small location every time in the heap area
// with loading the variable reference and function with its address 
// now the address of the location created in ram will be provided to a1 
// and we can access the variable i and method funB,

// when we call funB inside main method
// the jvm executer will go to that address and find the method body 
// and execute the statements in the body


public class A {
	
	int i = 10;
	
	static int j = 20;
	
	static void funA() {
		System.out.println("Inside FunA of A");
	}
	
	void funB() {
		System.out.println("Inside FunB of A");
	}
	
	public static void main(String[] args) {
		// there are 3 ways to access static variables
		// 1 - inside the same class we can access directly. (funA();)
		// 2 - using object of that class (obj.funA();)
		// 3 - using className (recommended way)(A.funA();)
		
		System.out.println("----------------------");
		System.out.println(j);
		funA();
		// creating a new object which is pointed by the new location from heap
		// and this object points to the context
		A a1 = new A();
		a1.funB();
		System.out.println("----------------------");
		System.out.println(a1.i);
		// here we can also accessing static members
		// because the a1 is by default pointing to the static member context
		// and we can access the static content whether its null
		System.out.println(a1.j);
		System.out.println("----------------------");
		a1.funA();
		// here still we can access the funA and j value
		// because the a2 is pointing towards the context A
		A a2 = null;
		System.out.println(a2.j);
		a2.funA();
		
		System.out.println("----------------------");
		A a3 = new A();
		// if we manipulate i variable of a1, the i variable inside a3 will not affected
		System.out.println(a1.i);
		System.out.println(a3.i);
		a1.i = 200;
		System.out.println(a1.i);
		System.out.println(a3.i);
		System.out.println("----------------------");
		// but if we manipulate j variable of a1 object, the j variable inside a3 
		// will also affected, also affect a2, because we manipulated context members
		System.out.println(a1.j);
		System.out.println(a2.j);
		System.out.println(a3.j);
		a1.j = 200;
		System.out.println(a1.j);
		System.out.println(a2.j);
		System.out.println(a3.j);
		
		// the links will look like
		// context (Reference) <-- a1 <-- new Object location <-- funB location <-- null
		// context (Reference) <-- a2 <-- null
		// context (Reference) <-- a3 <-- new Object location <-- funB location <-- null
	}

}
