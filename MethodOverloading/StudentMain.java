package MethodOverloading;

public class StudentMain {

	
	public static void main (String args[]) {
		
		Student t = new Student();
		t.display();
		
		Student st= new Student (34);
		st.display();
		
		
		Student s = new Student(3, "jiya");
		s.display();
	
	}
}
