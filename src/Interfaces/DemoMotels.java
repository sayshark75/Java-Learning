package Interfaces;

// a class can implement multiple interfaces simultaneously
// also can extent another one class simultaneously with multiple interfaces
public class DemoMotels implements Dhaba,Chinese{

	@Override
	public void noodles() {
		System.out.println("noodles in Motel");
	}
	@Override
	public void chickenChilli() {
		System.out.println("chickenChilli in Motel");
	}
	@Override
	public void soup() {
		System.out.println("soup in Motel");
	}
	@Override
	public void dalMakhni() {
		System.out.println("dalMakhni in Motel");
	}
	@Override
	public void gheeParatha() {
		System.out.println("gheeParatha in Motel");
	}
	@Override
	public void lassiFull() {
		System.out.println("lassiFull in Motel");
	}
	
	public static void main(String[] args) {
		
		// Only able to call Interface methods of Dhaba
		Dhaba d = new DemoMotels();
		d.dalMakhni();
		d.gheeParatha();
		d.lassiFull();
		
		// Only able to call Interface methods of Chinese
		Chinese c = new DemoMotels();
		c.noodles();
		c.chickenChilli();
		c.soup();
		
		// Can Call all methods including own members as well
		DemoMotels m = new DemoMotels();
		m.chickenChilli();
		m.dalMakhni();
		m.lassiFull();
		m.soup();
		m.noodles();
		m.gheeParatha();
	}
}
