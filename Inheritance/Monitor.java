/*
 * Create class structure:
College → Teacher and College → Student → Monitor.
Write separate methods for each class and test using Monitor object.
 */


package Inheritance;

public class Monitor extends Studentt {

	  public void showMonitor() {
	        System.out.println("This is Monitor class.");
	    }

	    public static void main(String[] args) {

	        // Create object of Monitor to access inherited methods
	        Monitor m = new Monitor();

	        m.showCollege();   // Method from College
	        m.showStudent();   // Method from Student
	        m.showMonitor();   // Method from Monitor

	        // m.showTeacher(); // Not allowed because Monitor does not inherit Teacher
	    }
	
}
