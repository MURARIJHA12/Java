package Assignement;
//Palindrome(sentence).
import java.util.*;
public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=src.nextLine().toLowerCase();
		//case:1-Remove the Space
		String str1=str.replaceAll(" ","");
		//case:2-Senterce ko check kar lo ki o palindrome hai
		int flag=1;
		int first=0;
		int least=str1.length()-1;
		while(first<least) {
			if(str1.charAt(first)!=str1.charAt(least)) {
				flag=0;
				break;
			}
			first++;
			least--;
		}
		if(flag==1) {
			System.out.println("Senterce are Pallindrome");
		}
		else {
			System.out.println("Sentence are not Pallindome");

		}


	}

}
