/*
 * Create a class Student with:

private variable: rollNo
public methods: setRollNo() and getRollNo()

Create another class to access the value.
 */

package AcessSpecifier;

public class StudentMain {

	
	public static void main(String [] args) {
		Student st = new Student();
           st.setRollNo(78);
   		System.out.println("the roll no" + " " +st.getRollNo());
	}
}
