package Encapsulations;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Hello Abstract class");
		EncapsulatedClass e1 = new EncapsulatedClass(14, "Sharuk",57);
		
		String s = e1.toString();
		System.out.println(s);
	}
}
