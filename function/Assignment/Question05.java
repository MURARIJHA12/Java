package Assignment;
import java.util.*;
// Swap of two number
public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner src=new Scanner(System.in);
      System.out.println("Enter the First Element:");
      int a=src.nextInt();
      System.out.println("Enter the second Element:");
      int b=src.nextInt();
      System.out.println("before swapping: a = " + a + ", b = " + b);
      swap(a,b);
	}
	public static void swap(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		 System.out.println("After swapping: a = " + a + ", b = " + b);
	}

}
