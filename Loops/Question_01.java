
//Find the greatest Element in an arrays
import java.util.*;
public class Question_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner src=new Scanner(System.in);
     System.out.println("Enter the first no:");
     int a=src.nextInt();
     System.out.println("Enter the second no:");
     int b=src.nextInt();
     System.out.println("Enter the third no:");
     int c=src.nextInt();
     //condition operater method
     /*
     if(a>b&&b>c) {
    	 System.out.println("A is greatest element:"+a);
     }
     else if(b>c&&b>a) {
    	 System.out.println("B is the greatest element in an arrays:"+b);
     }
     else {
    	 System.out.println("C is the greatest no"+c);
     }
     */
     //function in java
     int max=Integer.MIN_VALUE;
     max=Math.max(c,Math.max(a, b));
     System.out.println("Maximum element in an arrays:"+max);
	}

}
