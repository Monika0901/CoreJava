package AbstractionUsingInterface;

public class Subtraction implements Calculator {

    @Override
    public void calculate(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

}
