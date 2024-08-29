import java.util.Scanner;
public class reverse_no {
    public static void main(String[] args){
        int n,rev=0;
        Scanner src=new Scanner(System.in);
        System.out.println("enter the numbe=");
        n=src.nextInt();
        for(int i=n;i>0;i=i/10){
            int rem=i%10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
    }
    
}
