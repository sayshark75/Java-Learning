package Interfaces;

public class DemoHotels implements Hotel {

	@Override
	public void dalMakhni() {
		System.out.println("dalMakhni in DemoHotels");
	}
	@Override
	public void gheeParatha() {
		System.out.println("gheeParatha in DemoHotels");
	}
	@Override
	public void lassiFull() {
		System.out.println("lassiFull in DemoHotels");
	}
	@Override
	public void noodles() {
		System.out.println("noodles in DemoHotels");
	}
	@Override
	public void chickenChilli() {
		System.out.println("chickenChilli in DemoHotels");
	}
	@Override
	public void soup() {
		System.out.println("soup in DemoHotels");
	}
	@Override
	public void chickenBiryani() {
		System.out.println("chickenBiryani in DemoHotels");
	}
	@Override
	public void dalChawal() {
		System.out.println("dalChawal in DemoHotels");
	}
	@Override
	public void paneerBhaji() {
		System.out.println("paneerBhaji in DemoHotels");
	}
	public void misaalPav() {
		System.out.println("misaalPav in DemoHotels");
	}

	public static void main(String[] args) {
		// we can access methods of demoHotel class based on 
		// different interface and their Inheritance
		
		// here we access DemoHotel Class members using Dhaba Interface
		System.out.println("----> Dhaba Referenced Object of DemoHotel");
		Dhaba d = new DemoHotels();
		// only able to access the overridden methods from dhaba
		d.dalMakhni();
		d.getClass();
		d.lassiFull();
		
		// simillarly for Chienese Interface
		System.out.println("----> Chinese Referenced Object of DemoHotel");
		Chinese c = new DemoHotels();
		c.chickenChilli();
		c.soup();
		c.noodles();
		
		// but the Hotel interface is extending (Inheriting) the Dhaba and chinese Interfaces
		// we have access to all the methods from hotel, Dhaba and chinese interface
		// overridden by the DemoHotel Class
		System.out.println("----> Hotel Referenced Object of DemoHotel");
		Hotel h = new DemoHotels();
		h.chickenBiryani();
		h.chickenChilli();
		h.dalChawal();
		h.dalMakhni();
		h.lassiFull();
		h.gheeParatha();
		h.noodles();
		h.paneerBhaji();
		h.soup();
		
		System.out.println("----> downcasted Object to DemoHotel from hotel Interface Object h");
		DemoHotels x = (DemoHotels)h;
		// all other Implemented methods + own members
		x.misaalPav();
	}
}
