package SuperKeyword;

public class Employee extends Person {

	int id;
	
	 // Initialize parent class variable
	public Employee(String name,int id) {
		 // Call parent class constructor
	    super(name);

        // Initialize child class variable
		this.id= id;
	}	
	
	// Display employee details
      public void dispaly() {
  
   	System.out.println("Empoyee name = "+ " "+this.name );
	System.out.println("Empoyee id = "+ " "+this.id );
     }
}
		
		
		
	

	

