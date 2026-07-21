package Encapsulation;

public class MobileMain {

    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.setCompany("Samsung");
        m.setPrice(24999);

        System.out.println("Company : " + m.getCompany());
        System.out.println("Price : ₹" + m.getPrice());
    }
}