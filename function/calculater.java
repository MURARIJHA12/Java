import java.util.*;
public class calculater {
    //sum of two no;
    public  static int sum(int a,int b){
        return a+b;
    }
    //difference of two no
    public static int sub(int a,int b){
        return a-b;
    }
    //multiplication of two number
    public static int mul(int a,int b){
        return a*b;
    }
    //Division of two number;
    public static int div(int a,int b){
        return a/b;
    }
    //mod of two number;
    public static int mod(int a,int b){
        return a%b;
    }

    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.print("Enter the first no");
        int a=src.nextInt();
        System.out.print("Enter the second no");
        int b=src.nextInt();

        System.out.println("Sum of two no="+sum(a,b));

        System.out.println("Subtraction  of two no="+sub(a,b));

        System.out.println("multiplication  of two no="+mul(a,b));

        System.out.println("Divison   of two no="+div(a,b));

        System.out.println("moduls  of two no="+mod(a,b));
    }
    
}
 