package Assignement;
//Count the Number of Words in the Senetence
import java.util.Scanner;
public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String str=src.nextLine();
		int count=1;
		//StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
		System.out.println("Number of words in Sentence:"+count);
	}

}
