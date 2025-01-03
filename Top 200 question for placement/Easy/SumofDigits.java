import java.util.*;
class SumofDigits{
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=src.nextInt();
        int sum=0;
        int i=n,rem;
        while(i>0){
             rem=i%10;
            sum=sum+rem;
            i=i/10;
        }
        System.out.println(sum);
    }
}