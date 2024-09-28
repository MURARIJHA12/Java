import java.util.*;
public class prime {
    public static void prime(int n){
        int i,count=0;
        for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.print("no are   prime");
        }
        else{
            System.out.print("no are not prime");
        }
    }
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
       prime(n);
    }
}
