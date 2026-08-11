
	// NumberFormatException
	// Convert String "abc" into integer and handle the exception


package Exception;

public class C {

	
	    public static void main(String args[]) {

	        String str = "abc";

	        try {
	            int num = Integer.parseInt(str);
	            System.out.println(num);
	        } catch (NumberFormatException e) {
	            System.out.println("Cannot convert String into integer");
	        }
	    }
	}