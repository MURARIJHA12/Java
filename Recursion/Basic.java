import java.util.*;
public class Basic {
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.println(n+"   "); 
        printDec(n-1); 
    }
    public static void main(String[] args) {
        int n,i;
        Scanner src=new Scanner (System.in);
        System.out.println("Enter the maximum element = ");
        n=src.nextInt();
        printDec(n);

        
    }
}
