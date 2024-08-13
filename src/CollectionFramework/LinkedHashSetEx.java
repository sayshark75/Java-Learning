package CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	// Linked Hash Set:
	// It also similar to the Set but it can maintain the insertion order
	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<>();
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
