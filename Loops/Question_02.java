package Loops;
import java.util.Scanner;
//Fibonical series;
public class Question_02 {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=src.nextInt();
		int a=0;
		int b=1;
		int count=2;
		while(count<=n) {
			int temp=b;
			 b= b+a;
			 a=temp;
			 count++;
	}
		System.out.println(b);

}
	}
