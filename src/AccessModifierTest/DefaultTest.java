package AccessModifierTest;

// we can't extend/inherit a default class from another package
public class DefaultTest {
	// we can't create a object of a default class in a class of another package
	public static void main(String[] args) {
		System.out.println("Unable to locate default class here");
	}
}
