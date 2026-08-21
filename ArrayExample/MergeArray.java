package ArrayExample;

public class MergeArray {
	public static void main(String args[]) {

        int[] a = {10, 20, 30};
        int[] b = {40, 50, 60};
        int [] c= new int [a.length+ b.length];
        
        System.out.println("First array");
        for (int i =0 ; i<a.length; i++) {
        	System.out.println(a[i]);
        	c[i] = a[i];
        }
        System.out.println("Second array");
        for (int i =0 ; i<b.length; i++) {
        	System.out.println(b[i]);
        	c[a.length+i]= b[i];
	}
        
        System.out.println("merge Array");
        
         for (int i = 0; i<c.length;i++){
        	 System.out.println(c[i]);
         }
}
}
