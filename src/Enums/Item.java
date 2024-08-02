package Enums;

// example of Enum

public enum Item {
	
	SUGAR,SALT,PENCIL(5),PEN(12);
	
	int price;
	
	// Constructor
	 private Item() {
		this.price=20;
	}
	
	 // overloaded constructor (parameterize)
	 private Item(int price) {
		 this.price = price;
	 }
	
	 // getter method
	 public int getPrice() {
		 return this.price;
	 }
	 
	 
}
