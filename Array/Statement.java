import java.util.Arrays;
import java.util.Scanner;
public class Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner src=new Scanner(System.in);
		
		System.out.println("Enter the size of an arrays:");
		
		int n=src.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=src.nextInt();
			
		}
		int rear =0;
		while(true) {
			System.out.println("do you inserted the element: Press Y for entering number otherwise press y");
			 char ch = src.next().charAt(0);
			 if(ch=='Y'||ch=='y') {
				 System.out.println("Enter the number");
				 int num = src.nextInt();
				 arr[rear++]=num;
				 if(rear==n) {
					 rear=0;
				 }
				 
			 }else {
				 break;
			 }
			 
		}
		//System.out.print(Arrays.toString(arr));
	
		for(int num :arr ) {
			System.out.print(num+" ");
		}

	}

}
