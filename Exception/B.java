
//NullPointerException
//Write a program that calls a method on a null String and handle NullPointerException.
  package Exception;

public class B {
	

	public static void main(String args[]) {
		String name = null;
	try {
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(3));
	}
	catch(java.lang.NullPointerException e) {
		System.out.println("Cannot perform operation because String is null");
	}
		
	}
}