package Bindings;

public class LateInterfaceImpl implements LateInterface {
	// in this class, which Implemented the Interface, has to override 
	// all the Methods.
	// Here overriding happened, so Late Binding Happens
    @Override
    public void displayMessage() {
        System.out.println("Hello from LateInterfaceImpl!");
    }
}
