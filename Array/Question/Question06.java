//duplication of an arrays
import java.util.*;
public class Question06 {

	public static void main(String[] args) {

		Scanner src=new Scanner(System.in);
		
		
		
		System.out.println("Enter the length of an Arrays:");

		int n=src.nextInt();
		
		int k=0;
		
		int arr[]=new int[n];
		
		int duplication[]=new int[n];
		
		System.out.println("Enter the Element of an Arrays:");
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=src.nextInt();
			
			
		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
			System.out.println(arr[i]);
					
					 duplication[k]=arr[i];
					k++;
				}
			}
		}
		System.out.println("Duplication element in the Arrays=");
		for(int i=0;i<n;i++) {
			System.out.println( duplication[i]);
		}


	}

}
