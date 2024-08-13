package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String[] args) {
		// we can create a array list of strings like this
		// if we does not provide the generic type in RHS Class call, 
		// it will automatically added by the compiler by comparing LHS
		ArrayList<String> a1 = new ArrayList<>();
		
		// we will get a empty array []
		// here the default toString method is overridden
		// and shows the content in a array
		System.out.println(a1);	
		
		// there are various methods in Array List, and other Data Structures as well,
		// we can check java collection interface methods in Oracle official documentation
		
		// we can add a new Element in the array List, it will be maintained sequentially
		System.out.println("************** add single Element");
		a1.add("Hello");
		a1.add("world");
		a1.add("apple");
		a1.add("grape");
		a1.add("strawberry");
		// we can add duplicate elements
		a1.add("Hello");
		// also can add null value
		a1.add(null);
		
		System.out.println(a1);
		System.out.println("************** Get Single Element");
		// we can get specific Element based on its index
		System.out.println(a1.get(0));
		System.out.println(a1.get(4));
		
		// we can make loop over the array
		System.out.println("************** for loop normal");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println("************** for loop advanced");
		for(String s : a1) {
			System.out.println(s);
		}
		
		System.out.println("************** loop with Iterator object");
		Iterator<String> itr = a1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("************** get the Size");
		System.out.println("Size of a1: "+ a1.size());
	}
}
