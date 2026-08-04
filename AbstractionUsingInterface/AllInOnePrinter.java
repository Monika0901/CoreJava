/*
 * Multiple Interface Implementation

Create the following interfaces:

Printable → void print();
Scannable → void scan();
Faxable → void fax();

Create a class AllInOnePrinter that implements all three interfaces.

Challenge:

Access methods using interface references.
 */
package AbstractionUsingInterface;

public class AllInOnePrinter implements Printable,Scannable,Faxable{

	@Override
	public void fax() {
		System.out.println("Sending fax...");
		
	}

	@Override
	public void scan() {
		System.out.println("Scanning document...");
		
	}

	@Override
	public void print() {
		System.out.println("Printing document...");
		
	}

	
	
}
