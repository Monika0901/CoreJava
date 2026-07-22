/*  Overload a constructor in a Student class to initialize:
default values
only id
id and name*/


package MethodOverloading;

public class Student {
       int id;
       String name;
       
       // Default constructor
       public Student() {
          }
       
       
       // Constructor to initialize id and name
	  public Student(int id) {
		this.id= id;
		}
	  
	    // Constructor to initialize id and name
     public Student(int id, String name) {
		this.id= id;
		this.name= name;
		
	}
	
	public void display() {
		 System.out.println("Student Id = " + id);
	        System.out.println("Student Name = " + name);
	}
}

