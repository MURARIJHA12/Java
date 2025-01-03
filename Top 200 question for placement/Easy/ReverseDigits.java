import java.util.*;
public class ReverseDigits {
    
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=src.nextInt();
        int rev=0,i=n;
        while(i>0){
            int rem=i%10;
            rev=rev*10+rem;
            i=i/10;
        }
        System.out.println(rev);

    }
}
