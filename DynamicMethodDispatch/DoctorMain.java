/*
 * Hospital Management

Question:
Create a parent class Doctor with a method treatPatient().
Create child classes Cardiologist and Dentist.
Override the method and call it using a Doctor reference.
 */

package DynamicMethodDispatch;

public class DoctorMain {
   
	public static void main(String args[]) {
		
		Doctor dc;

		
		dc = new Cardiologist();
		dc.treatPatient();
		
		dc= new Dentist();
		dc.treatPatient();
	}
}
