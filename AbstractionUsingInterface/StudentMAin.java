package AbstractionUsingInterface;

public class StudentMAin {
    public static void main(String[] args) {

     LibraryOperations lr;
     lr = new Student();
     lr.issueBook();
     lr.returnBook();
     lr.calculateFine(5);

        
    }

}
