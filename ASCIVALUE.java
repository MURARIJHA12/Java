import java.util.Scanner;
public class ASCIVALUE {
    public static void main(String args []){
        char ch;
        System.out.println("EDnter the value of charcter=");
        Scanner src=new Scanner(System.in);
        ch=src.next().charAt(0);
        int x=ch;
        System.out.println("Asci value of "+ch+"is="+x);
    }
    
}
