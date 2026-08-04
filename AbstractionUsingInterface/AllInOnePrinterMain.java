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

public class AllInOnePrinterMain {
    public static void main (String args[]) {
    	
    	Scannable sc;
    	sc = new AllInOnePrinter();
    	sc.scan();
    	
    	Faxable fb;
    	fb = new AllInOnePrinter();
    	fb.fax();
    	
    	Printable p;
    	p = new AllInOnePrinter();
    	p.print();
    }
}
