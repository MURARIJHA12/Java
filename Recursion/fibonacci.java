import java.util.*;
public class fibonacci {
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int  fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the fibnoacci series=");
        int n=src.nextInt();
        System.out.println(fib(n));
    }
    
}
