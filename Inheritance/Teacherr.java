/*
 * Create class structure:
College → Teacher and College → Student → Monitor.
Write separate methods for each class and test using Monitor object.
 */
package Inheritance;

public class Teacherr extends Collage {

    public void showTeacher() {
        System.out.println("This is Teacher class.");
    }

    public static void main(String[] args) {

        // Create object of Teacher to test Teacher class
        Teacherr t = new Teacherr();

        t.showCollege();
        t.showTeacher();
    }
}
