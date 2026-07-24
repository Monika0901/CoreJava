package Inheritance;

	public class Student extends Person {

	    int rollNo = 101;

	    public void display() {
	        System.out.println("Name = " + name);
	        System.out.println("Roll No = " + rollNo);
	    }

	    public static void main(String[] args) {

	        Student s = new Student();
	        s.display();
	    }
	}

