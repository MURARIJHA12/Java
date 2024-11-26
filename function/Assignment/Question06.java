package Assignment;
//check the prime no
import java.util.*;
public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner src=new Scanner(System.in);
       System.out.println("Enter the Number:");
       int n=src.nextInt();
       prime(n);
	}
	public static void prime(int n) {
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count<=0) {
			System.out.println("prime number:"+n);
		}
		else {
			System.out.println("Does not prime number:"+n);
		}
	}

}
