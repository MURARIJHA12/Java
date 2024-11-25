package Assignement;
//Remove All the Spaces from a Sentence.
import java.util.Scanner;
public class Question02 {
	public static void main(String[] args) {
		
	
	Scanner src=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=src.nextLine();
	//for the function through
	/*
	String str1=str.replaceAll(" ", "");
	System.out.println(str1);

    */
	//char ch;
	//2nd method
	
	StringBuilder str2=new StringBuilder();
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch==' ') {
			continue;
		}
		else {
			str2.append(str.charAt(i));
		}
	}
	System.out.println(str2);

}

}