package Encapsulation;

public class GradeMain {

	    public static void main(String[] args) {

	        Grade g = new Grade();

	        g.setName("Monika");
	        g.setMarks(78);

	        System.out.println("Name  : " + g.getName());
	        System.out.println("Marks : " + g.getMarks());
	        System.out.println("Grade : " + g.checkGrade());
	    }
	}
