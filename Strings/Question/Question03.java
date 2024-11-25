package Assignement;
//  Palindrome(word).
import java.util.*;
public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the words:");
		String str=src.nextLine().toLowerCase();
		//String str2;
		int flag = 1;
		int first=0,last=str.length()-1;
		while(first<last) {
			if(str.charAt(first)!=str.charAt(last)) {
				flag = 0;

				break;
			}
			first++;
			last--;
		}
		//System.out.println(flag);
		if(flag==1) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}

	}
}
