package AbstractionUsingInterface;

public class Addition implements Calculator {

    @Override
    public void calculate(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

}
