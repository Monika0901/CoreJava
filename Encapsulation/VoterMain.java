package Encapsulation;

public class VoterMain {

	public static void main(String args[]) {
		
		Voter vo = new Voter();
		 
		vo.setName("Riya");
		vo.setAge(23);
		
		 System.out.println("Name : " + vo.getName());
	        System.out.println("Age : " + vo.getAge());

	        vo.checkEligibility();
	    }

	}

