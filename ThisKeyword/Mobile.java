/*method chaining
 * 
 * Create a class Mobile with:

setBrand(String brand)
setModel(String model)
setPrice(double price)
display()

Use method chaining.
 */

package ThisKeyword;

public class Mobile {

	//instance variable
	String brand;
	String model;
	double price;
	
	//method setBrand(String brand)
	public Mobile setBrand(String brand) {
		this.brand =  brand ;
		return this;
	}
	
 //method setModel(String model)
	public Mobile setModel(String model) {
		this.model =  model ;
		return this;
	}
	
	//method setPrice(double price)
	public Mobile setPrice(double price) {
		this.price =  price ;
		return this;
	}
	
	// display method 
	public void display() {
	System.out.println("Brand of Mobile = "+ this.brand);
	System.out.println("model of Mobile = "+ this.model);
	System.out.println("price of Mobile = "+ this.price);
	}
	
	
	public static void main(String []args) {
		 
		Mobile mb = new Mobile();
		mb.setBrand("ViVo");
		mb.setModel("y28");
		mb.setPrice(20000.0);
		mb.display();
	}
}

