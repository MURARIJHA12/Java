import java.util.*;
public class sumn_number {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
       int snm1=sum(n-1);   
       int sN=n+snm1;
       return sN;
    }
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the su of the number=");
        int n=src.nextInt();
        System.out.println(sum(n));
    }
    
}
