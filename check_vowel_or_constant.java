import java.util.Scanner;
public class check_vowel_or_constant {
    public static void main(String[] args){
        char ch;
        System.out.println("Enter the characte=");
        Scanner src=new Scanner(System.in);
        ch=src.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("charecter are vowel="+ch);
        }
        else{
            System.out.println("charecter are consonant="+ch);
        }
    }
    
}
