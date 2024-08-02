package Enums;

public enum City {

	DELHI{
		// to override a method separately for a enum object we do this
		@Override
		public void message() {
			System.out.println("Welcome User.. in Delhi");
			System.out.println("your area contains : "+numberOfTowers);
		}
		
	},MUMBAI,
	// in chennai, we overloading the constructor
	CHENNAI("50 towers"),KOLKATA;
	
	String numberOfTowers;
	
	private City() {
			
		this.numberOfTowers = "100 Towers";
		
		
	}
	
	private City(String numOfTowers) {
		
		this.numberOfTowers = numOfTowers;
	}
	
	public void message() {
		System.out.println("Welcome User..");
		System.out.println("your area contains : "+numberOfTowers);
	}
	
}
