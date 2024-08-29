import java.util.Scanner;
public class palindromno {
    public static void main(String[] args){
        int n,rev=0,rem,i;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the number");
        n=src.nextInt();
        for(i=n;i>0;i=i/10){
            rem=i%10;
            rev=rev*10+rem;
        
        }
        if(rev==n){
            System.out.println("Number are pallindrom"+" "+n);
        }
        else{
            System.out.println("number are not palindrom"+" "+n);
        }

    }
    
}
