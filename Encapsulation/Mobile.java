/* Question:
Create a Mobile class with private variables:

company
price

Add setter and getter methods.
Print the mobile details.
*/

package Encapsulation;

public class Mobile {

    // Private variables
    private String company;
    private double price;

    // Getter and Setter for company
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}