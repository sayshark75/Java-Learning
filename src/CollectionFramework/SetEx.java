package CollectionFramework;

import java.util.HashSet;

public class SetEx {
	// as we saw Array List, most of the methods are same as they are implemented from 
	// collection interface as shown in the Collection Framework Hierarchy
	
	// a Hash Set does not maintain order of insertion
	// also we cannot add duplicates,
	// we can add null value, but only once, as the duplicates will be ignored
	
	// for Example:
	
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Hello");
		hs.add("hello");// set is case sensitive
		hs.add("World");
		hs.add("World");
		hs.add(null);
		hs.add(null);
		hs.add("null");// here null is string, so we can see it as duplicate, but it is not
		
		System.out.println(hs);
		
		// we can perform similar loop operations on set as well
		
	}
	
}
