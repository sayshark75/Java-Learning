package ExceptionHandling;

public class ExceptionRethrowing {
	
	// we can throw our own custom Exception instead of some inbuilt 
	// unchecked or checked Exception
	
	public void fun1(int num1,int num2) throws UserDefinedException {
		try {
			int resutl = num1/num2;
			// we catching the Arithmetic Exception
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			UserDefinedException ue = new UserDefinedException();
			// and throwing the UserDefined Custom Exception
			throw ue;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Start of main method...");
		
		ExceptionRethrowing er = new ExceptionRethrowing();
		
		try {
			er.fun1(100, 10);
			// here we converted AE to UDE
		} catch (UserDefinedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of main method...");
	}
}
