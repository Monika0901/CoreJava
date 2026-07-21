/*Create a Student class with private variables:

name
marks

Add:

setName()
setMarks()
getName()
getMarks()

Print the student's details.*/



package Encapsulation;

public class StudentMain {
   
	public static void main(String args []) {
		
		Student st = new Student();
		st.setName("Monika");
		st.setMarks(85);
		
		System.out.println("The Student name " + " "+ st.getName());	
		System.out.println(" your Marks is "+ " " + st.getMarks());
	}
}
