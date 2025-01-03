import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=src.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(n+"   factorial is   "+fact);
    }
}
