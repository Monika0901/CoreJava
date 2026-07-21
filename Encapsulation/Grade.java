/*Question: Check Student Grade

Create a class Exam with the following private variables:

studentName
marks

Add:

Setter and Getter methods
A method checkGrade() that prints the grade based on the marks.

Grade Criteria:

 A/B/C/ Fail */



package Encapsulation;

public class Grade {

    // Private variables
    private String name;
    private double marks;

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Check Grade
    public String checkGrade() {

        if (marks >= 85) {
            return "A";
        } else if (marks >= 65) {
            return "B";
        } else if (marks >= 45) {
            return "C";
        } else {
            return "Fail";
        }
    }
}