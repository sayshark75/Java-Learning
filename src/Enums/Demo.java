package Enums;

import java.util.Scanner;

public class Demo {
	
	public void printCity(City city) {
		if(city!=null) {
			city.message();
		}else {
			System.out.println("Invalid city");
		}
	}
	
	public static void main(String[] args) {
		// Item i = Item.SUGAR;
		// System.out.println(i.getPrice());
		Item[] iarr = Item.values();
		
		for(Item item: iarr) {
			System.out.println(item.ordinal()+1 + " - "+item+" price is : "+ item.getPrice());
		}
		
		Demo d1 = new Demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter City Name");
		String cityName = sc.next();
		// string to enum conversion
		City city = City.valueOf(cityName.toUpperCase());
		
		d1.printCity(city);
		
		// d1.printCity(City.DELHI);
		// d1.printCity(City.CHENNAI);
		// d1.printCity(City.MUMBAI);
		
	}
}
