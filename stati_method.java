import java.util.Scanner;
public class stati_method {
    static int a, b,c,sum,sub,mul,div,rem;
    public static void main(String[] args) {
        stati_method.input();
        stati_method.process();
        stati_method.output();
    }
    static void input(){
        Scanner src=new Scanner(System.in);
        System.out.print("Enter the first number=");
        a=src.nextInt();
        System.out.println("Enter the second number=");
        b=src.nextInt();

    }
    static void process(){
        sum=a+b;
        sub=a-b;
        mul=a*b;
        div=a/b;
        rem=a%b;

    }
    static void output(){

        System.out.println("Sum of two number="+" "+a+" and "+b+" = "+sum);

        System.out.println("sub of two number="+" "+a+" and "+b+" = "+sub);
        System.out.println("mul of two number="+" "+a+" and "+b+" = "+mul);
        System.out.println("div of two number="+" "+a+" and "+b+" = "+div);
        System.out.println("rem of two number="+" "+a+" and "+b+" = "+rem);
    }
    
}
