package Assignement;
//find the number of vowel and consonants in  a string
import java.util.*;
public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=src.nextLine();
		int vowelCount=0; 
		int	consonantcount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')) {
				vowelCount++;
			}
			else {
				consonantcount++;
			}
		}
		System.out.println("number of vowel in the sentence:"+vowelCount);
		System.out.println("number of Consonant in the sentence:"+consonantcount);
	}

}
