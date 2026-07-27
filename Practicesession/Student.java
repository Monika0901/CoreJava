/*
 * 
Create class Student:

Private fields: name, marks
Validate marks (0–100 only)
If invalid → print error
Use getter/setter
 */


package Practicesession;

public class Student {
	
 private String name;
 private int marks;
 
 
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 
 public int getMarks() {
	return marks;
 }
 public void setMarks(int marks) {
	
 
	System.out.println("Name ="+ " "+ name);

 if(marks >= 0 && marks <= 100) {
	 this.marks = marks; 
	 System.out.println(" your marks is"+ " "+ marks);
 }
 else {
	 System.out.println("Error: Marks should be between 0 and 100." );
 
}
}
}
