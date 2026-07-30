/*
 * Constructor using this

Create a class Student with fields:

id
name
course

Use the this keyword to initialize all variables through a constructor.
 */


package ThisKeyword;

public class Student {

  int id ;
  String name;
  String course;
  
  public Student(int id , String name, String course ) {
	  
	  this.id = id;
	  this.name = name;
	   this.course = course;
	   
	   System.out.println("Student id = "+ " "+ this.id);
	   System.out.println("Student Name = "+ " "+ this.name);
	   System.out.println("Student Course = "+ " "+ this.course);
  }
}
