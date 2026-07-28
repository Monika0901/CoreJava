
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

public class EngineeringStudent extends Student {

	
	@Override
public void calculateGrade(String name, double marks) {
		
		System.out.println("Student name = " + " "+name);
		System.out.println("Student Marks = " + " "+marks);
		
		if (marks >= 85) {
			System.out.println("Grade A = " + " "+marks);
		}
		
		else if (marks >= 65) {
			System.out.println("Grade B = " + " "+marks);
		}
		
		else if (marks >= 45) {
			System.out.println("Grade C = " + " "+marks);
		}
		else {
			System.out.println("Grade Fail = " + " "+marks);
		}
		
}

}
