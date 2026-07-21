/*  Voter Eligibility

Private variables:
name
age
Methods:
Setters and getters
checkEligibility()*/

package Encapsulation;

public class Voter {
	
	//Private variables:
    private String name;
    private int age;
    
    
    //Setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	  // Check Eligibility
   public void checkEligibility() {
        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }
	}
    
    
}
