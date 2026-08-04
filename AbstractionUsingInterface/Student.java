package AbstractionUsingInterface;

public class Student extends Book implements LibraryOperations {

	@Override
	public void issueBook() {
		if(availableBooks > 0) {
			availableBooks--;
			System.out.println("Book Issued Successfully");
			
		}
		else {
			 System.out.println("Book Not Available");
		}
		
	}

	@Override
	public void returnBook() {
		availableBooks++;
        System.out.println("Book Returned Successfully");
        System.out.println("Available Books = " + availableBooks);
		
	}

	@Override
	public void calculateFine(int days) {
		int fine = days * 10;
        System.out.println("Fine = ₹" + fine);
		
	}

}
