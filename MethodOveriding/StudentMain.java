/*
 * University Result System

Create a parent class Student.

Create child classes:

EngineeringStudent
MedicalStudent
CommerceStudent

Requirements:

Store marks.
Override calculateGrade().
Display grade according to each department's grading policy.
 */


package MethodOveriding;

public class StudentMain {
	
   public static void main(String args[]) {
	  
	   System.out.println("This is the details of Student grade");
	   Student st = new Student();
	   st.calculateGrade("Monika", 85);
	   System.out.println("--------------------------------");
	   
	   
	   
	   System.out.println("This is the details of Medical Student grade");
	   MedicalStudent md = new MedicalStudent();
	   md.calculateGrade("Priya", 85);
	   System.out.println("--------------------------------");
	   
	   
	   
	   System.out.println("This is the details of Engineering Student grade");
	   EngineeringStudent eg = new EngineeringStudent();
	   eg.calculateGrade("Soniya", 86);
	   System.out.println("--------------------------------");
	   
	   
	   
	   System.out.println("This is the details of Commerce Student grade");
	   CommerceStudent cm = new CommerceStudent();
	   cm.calculateGrade("jaya", 75);
	   System.out.println("--------------------------------");
   }
}
