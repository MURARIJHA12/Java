package Assignment;
//Method the count Vowels in a String
import java.util.*;
public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner src=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=src.nextLine();
    CountVowel(str);
	}
	public static void CountVowel(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')) {
				count++;
			}
		}
		System.out.println("Number of vowel in the sentence:"+count);
	}

}
