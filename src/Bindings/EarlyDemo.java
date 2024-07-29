package Bindings;

// connecting a method call to a method body is called binding

public class EarlyDemo {
	public String name;
	
	EarlyDemo(String name) {
		this.name = name;
	}
	
	// early accessible method, which is not overridden
	public String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
		// No specific code needed here for this example
	}
}
