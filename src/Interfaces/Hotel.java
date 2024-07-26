package Interfaces;

//interface can not extends another class (Normal class, concrete class, fully implemented class) 
//and can not implements any interface also.
//Interface can Inherit (extend) another Interface 
//also can be extend multiple interfaces using comma

public interface Hotel extends Dhaba,Chinese {
	public void chickenBiryani();
	public void dalChawal();
	public void paneerBhaji();
}
