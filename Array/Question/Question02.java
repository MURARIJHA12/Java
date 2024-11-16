

//Question 2nd:Find the largest element in the array
import java.util.Scanner;

public class Question02 {
	public static void main(String args[]) {
		
		Scanner src=new Scanner(System.in);
		
		System.out.println("Enter the Size of an arrays:");
		
		int n=src.nextInt();
		
		int Arr[]=new int[n];
		
		System.out.println("Enter the Element of an arrays:");
		
		for(int i=0;i<Arr.length;i++) {
			
			Arr[i]=src.nextInt();
		}
		System.out.print("orignal Array elemenyt are="+" ");
		
		for(int i=0;i<n;i++) {
			
			System.out.print(Arr[i]+" ");
			
		}
		
		int max=Arr[0];
		
		System.out.print("\nLargest Element in the Arrays=");
		
         for(int i=1;i<n;i++) {
			
			if(max<Arr[i]) {
				max=Arr[i];
				
			}
			
			
		}
         System.out.print(max);
		
		
	}

}
