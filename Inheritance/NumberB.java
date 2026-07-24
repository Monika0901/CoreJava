/*
 * Create class A with variable a = 100.
Class B extends A and doubles the value: b = a * 2.
Print both values.
 */
package Inheritance;

public class NumberB extends NumberA {

    int b = a * 2;

    public static void main(String[] args) {

        NumberB nb = new NumberB();

        System.out.println("The value of a is = " + nb.a);
        System.out.println("The value of b is = " + nb.b);
    }
}
