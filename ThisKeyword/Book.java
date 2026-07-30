/*
 * Constructor Chaining using this()

Create a class Book with:

Default constructor
One-parameter constructor
Two-parameter constructor

Use this() to chain all constructors.
 */

package ThisKeyword;

public class Book {
	
	//instance Variable
	int id;
	String name; 
	String type;
	
	
	//Default constructor
	public Book() {
		this(33);        // Call One-parameter constructor
		System.out.println("This is book info");
	}

	//One-parameter constructor
	public Book(int id) {
		this("java", "programming");
		this.id= id;                     //CallTwo-parameter constructor
		System.out.println("Book id = " + this.id );
		
	}
	
	//Two-parameter constructor
	public Book(String name, String type) {
		
		this.name = name;
		this.type = type;
		System.out.println("Book Name = "+ " " + this.name);
		System.out.println("Book type = "+ " " +this.type);
	}

	//Main method
	public static void main(String [] args) {
		
		Book bo = new Book();
	}
		
	
}
