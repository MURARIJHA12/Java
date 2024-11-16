

// Question :Count and print the count of number of duplicate elements

import java.util.*;
public class Question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner src=new Scanner(System.in);
		
		System.out.println("Enter the Size of an arrays:");
		
		int n=src.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the element of an arrays:");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=src.nextInt();
		}
		
		System.out.println("Element of an arrays"+" ");
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		 int count=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			System.out.println();
		}
		
		System.out.println("Total duplication Element in the Arrays="+count);
    	}

}
