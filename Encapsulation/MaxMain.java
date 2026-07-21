package Encapsulation;

public class MaxMain {

	
	

	    public static void main(String[] args) {

	        Max m = new Max();

	        m.setNum1(25);
	        m.setNum2(80);
	        m.setNum3(45);

	        System.out.println("First Number  : " + m.getNum1());
	        System.out.println("Second Number : " + m.getNum2());
	        System.out.println("Third Number  : " + m.getNum3());

	        System.out.println("Maximum Number : " + m.getMax());
	    }
	}

