

//Question 1: Find the average marks of 10 students.

import java.util.Scanner;

public class Question01 {

	public static void main(String args[]) {
		
		Scanner src=new Scanner(System.in);
		
		System.out.println("Enter the 10 subject marks");
		
		int marks[]=new int[10];
		
		for(int i=0;i<10;i++) {
			
			marks[i]=src.nextInt();
		}
		int sum=0;
		
		for(int i=0;i<10;i++) {
			
			sum+=marks[i];
		}
		double avg=sum/10;
		
		System.out.println("Average of 10 subject="+avg);

	}

}
