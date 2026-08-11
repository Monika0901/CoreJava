package Exception;
//ArithmeticException
//Write a Java program to divide two numbers and handle ArithmeticException
public class A {
	public static void main(String args[]) {
		
		System.out.println(10/2);
		System.out.println(30/2);
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			
			System.out.println("this is catch block");
		}
	
		System.out.println(60/2);
	}

}
