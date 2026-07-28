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

public class Student {

	
	public void calculateGrade(String name, double marks) {
		
		System.out.println("Student name = " + " "+name);
		System.out.println("Student Marks = " + " "+marks);
		
		
	}
}
