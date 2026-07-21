/*Create a class with private variables

Question:
Create a class Person with private variables name and age.
Add setter and getter methods.
Create an object and print the name and age.*/


package Encapsulation;

public class Person {
     
//	 firstly declared variable as private
	private String name ;
	private int age;
	
	
	//  generate public getter & setter of this variables
	
	
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
	
}
