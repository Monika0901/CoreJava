/*
 * Hospital Management

Question:
Create a parent class Doctor with a method treatPatient().
Create child classes Cardiologist and Dentist.
Override the method and call it using a Doctor reference.
 */


package DynamicMethodDispatch;

public class Dentist extends Doctor {
	
	@Override
	public void treatPatient() {
	System.out.println("Dentist is treating a dental patient.");
}
}
