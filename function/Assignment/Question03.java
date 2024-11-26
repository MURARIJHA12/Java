package Assignment;
import java.util.*;
//find the maximum Element in an Arrays
public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner src=new Scanner(System.in);
      System.out.println("Enter the Size of an Arrays:");
      int n=src.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the Element of an arrays:");
      for(int i=0;i<n;i++) {
    	  arr[i]=src.nextInt();
      }
      MaxmumElement(arr);
	}
	public static void MaxmumElement(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Maximum element in an arrays:"+max);
	}

}
