/*
 * 
Create class Student:

Private fields: name, marks
Validate marks (0–100 only)
If invalid → print error
Use getter/sette
 */


package Practicesession;

public class StudentMain {
    public static void main(String args[]) {
    	Student st = new Student();
    	st.setName("Monika");
    	st.setMarks(102);
    	st.getName();
    	st.getMarks();
    }
}
