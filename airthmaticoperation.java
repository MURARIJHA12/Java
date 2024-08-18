import java.util.*;
public class airthmaticoperation {
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter the two integer");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("Addition of two integer="+(a+b));
        System.out.println("Subtruction of two integer="+(a-b));
        System.out.println("Multiplicatin of two integer="+(a*b));
        System.out.println("Division of two integer="+(a/b));
        System.out.println("Remainder of two integer="+(a%b));

    }
    
}
