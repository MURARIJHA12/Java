import java.util.*;
public class Swape {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the first value:");
        int n=src.nextInt();
        System.out.println("Enter the Second value:");
        int m=src.nextInt();
        //using third variable

        /* 
        System.out.println("after swaping "+"first "+n+"Second "+m);
        int temp=m;
        m=n;
        n=temp;
        System.out.println("before swaping "+"first "+n+"Second "+m);

        */

        //without third variable
        System.out.println("after swaping "+" first "+n+" Second "+m);
        n=m+n;
        m=n-m;
        n=n-m;
        
        System.out.println("after swaping "+" first "+n+" Second "+m);

    }
    
}
