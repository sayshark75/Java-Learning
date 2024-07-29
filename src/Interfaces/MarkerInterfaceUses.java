package Interfaces;

public class MarkerInterfaceUses implements EmptyInterface {
	
	public void funA(EmptyInterface e) {
		if(e != null) {
			System.out.println("Here we using MarkerInterfaceUses class with  EmptyInterface implementation");
			System.out.println("Only EmptyInterface Implementation type is allowed to call this method");
		}else {
			System.out.println("Null values not allowed");
		}
	}
	
	public static void main(String[] args) {
		
		// How the Marker Interface working?
		// for example:
		// the funA is only called by the class which use the EmptyInterface.
		// It will use it by following ways
		
		// EmptyInterface e1 = new EmptyInterface(); // wrong
		// EmptyInterface e1 = new MarkerInterfaceUses();
		MarkerInterfaceUses m1 = new MarkerInterfaceUses();
		// only then we can use the funA method with m1 as implementing class added as argument
		m1.funA(m1);
	
	}
}
