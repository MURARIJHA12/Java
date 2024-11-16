

//Question 4th:Arrange the elements in ascending order if given an unsorted array.
import java.util.Scanner;

public class Question04 {
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
			
			System.out.println(Arr[i]+" ");
			
		}
		System.out.println("Ascending order element:");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(Arr[i]>Arr[j]) {
					int temp=Arr[j];
					Arr[j]=Arr[i];
					Arr[i]=temp;
				}
			}
			System.out.println(Arr[i]);
		}
		
		
	}

}
