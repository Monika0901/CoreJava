/* Question:
Create an EvenOdd class with a private variable:

number

Add:

setNumber()
getNumber()
checkEvenOdd()

Print whether the number is Even or Odd.
*/

package Encapsulation;

public class EvenOdd {

    // Private variable
    private int number;

    
    // Getter Setter
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    
    
    // Check Even or Odd
   public  void checkEvenOdd() {
        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}