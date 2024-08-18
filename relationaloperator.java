import java.util.*;
public class relationaloperator {
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter the value of two integer=");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("true/false="+(a>b));
        System.out.println("True/False="+(a<b));
        System.out.println("True/false="+(a>=b));
        System.out.println("True/False"+(a<=b));
        System.out.println("True/false="+(a==b));
        
    }
}
