import java.util.*;
public class increasing {
    public static void incr(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        incr(n-1);
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.print("Enter the size of an element=");
        int n=src.nextInt();
        incr(n);

    }
    
}
