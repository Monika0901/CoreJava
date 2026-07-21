package Encapsulation;

public class PersonMain {
    
	public static void main(String args[]) {
		
		Person po = new Person();
		
		 po.setName("Monika");
		 po.setAge(22);
		 
		 System.out.println("Employee ID = " + po.getName());
		System.out.println("Employee Name = " + po.getAge()) ;
	}
}
