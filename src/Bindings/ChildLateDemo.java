package Bindings;

public class ChildLateDemo extends LateDemo {
	// but it is overrided by this Class
	// so to take decision of which method to invoke is occured, 
	// thats why late binding happens
    @Override
    public void displayMessage() {
        System.out.println("Hello from ChildLateDemo!");
    }
}
