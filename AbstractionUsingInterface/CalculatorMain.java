package AbstractionUsingInterface;

public class CalculatorMain {
	public static void main(String[] args) {

        Calculator c;

        c = new Addition();
        c.calculate(10, 5);

        c = new Subtraction();
        c.calculate(10, 5);

        c = new Multiplication();
        c.calculate(10, 5);
    }

}
