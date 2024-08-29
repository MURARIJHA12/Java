import java.util.Scanner;

public class swap_two {
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        int a,b;
        System.out.println("enter the first number=");
        a=src.nextInt();
        System.out.println("Enter the second number=");
        b=src.nextInt();
        System.out.println("befort swapined number"+a+b);
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("After swapint this number"+a+b);

    }
    
}
