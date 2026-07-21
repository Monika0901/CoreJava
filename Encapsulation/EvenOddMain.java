package Encapsulation;

public class EvenOddMain {

    public static void main(String[] args) {

        EvenOdd e = new EvenOdd();

        e.setNumber(15);

        System.out.println("Number : " + e.getNumber());

        e.checkEvenOdd();
    }
}