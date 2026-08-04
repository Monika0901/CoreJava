package AbstractionUsingInterface;

public class Multiplication implements Calculator {

    @Override
    public void calculate(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

}
