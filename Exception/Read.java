//ClassNotFoundException

package Exception;

public class Read {
	public static void main (String args[]) {
		try {
			Class.forName("Sonu");
		}
		catch(ClassNotFoundException e) {
			System.out.println("this is Example of Compile Time Exception");
			System.out.println("This class is not present in the System");
		}
	}
}
