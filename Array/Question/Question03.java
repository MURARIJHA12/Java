

//Question 3rd:Find the smallest element in the array
import java.util.Scanner;

public class Question03 {
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
		
		int min=Arr[0];
		
		System.out.print("\n smallest Element in the Arrays=");
		
         for(int i=1;i<n;i++) {
			
			if(min>Arr[i]) {
				min=Arr[i];
				
			}
			
			
		}
         System.out.print(min);
		
		
	}

}
