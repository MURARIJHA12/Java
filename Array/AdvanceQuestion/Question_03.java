import java.util.Scanner;
//remove duplication element in an arrays

public class Question_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner src=new Scanner(System.in);
		
		System.out.println("Enter the size of an arrays:");
		
		int n=src.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the element of an arrays:");
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=src.nextInt();
			
		}
		System.out.println("Orignal arrays are:");
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		
		//find maxmum of an arrays
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("maximum element of an arrays:"+max);
		
		//creation of new arrays 
		
		int Arr[]=new int[max+1];
		
		for(int i=0;i<Arr.length;i++) {
			
			if(Arr[arr[i]]==0) {
				
				Arr[arr[i]]++;
			}
		}
		
		System.out.print("REmove duplication Element then the An arrays");
		
		for(int i=0;i<Arr.length;i++) {
			
			if(Arr[i]==1) {
				
				System.out.print(i+" ");
			}
		}
		

	}

}

    

