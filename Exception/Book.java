//Write a Java program to demonstrate a book-reading scenario where an
//exception occurs and the `finally` block closes the book.


package Exception;

public class Book {

	public static void main(String args[]) {
		
		try {
			System.out.println("opeaning the book");
			System.out.println(10/0);
			System.out.println("reading the  book");
		
		}
		catch(ArithmeticException e) {
			System.out.println("Book id damage so you can not read the book");
		}
		finally {
			System.out.println("closeing the  book");
		}
	}
}
