import java.util.Scanner;
public class nonstati_method {
     int a, b,c,sum,sub,mul,div,rem;
    public static void main(String[] args) {
        nonstati_method ref=new  nonstati_method();
        ref.input();
        ref.process();
        ref.output();
    }
     void input(){
        Scanner src=new Scanner(System.in);
        System.out.print("Enter the first number=");
        a=src.nextInt();
        System.out.println("Enter the second number=");
        b=src.nextInt();

    }
     void process(){
        sum=a+b;
        sub=a-b;
        mul=a*b;
        div=a/b;
        rem=a%b;

    }
     void output(){

        System.out.println("Sum of two number="+" "+a+" and "+b+" = "+sum);

        System.out.println("sub of two number="+" "+a+" and "+b+" = "+sub);
        System.out.println("mul of two number="+" "+a+" and "+b+" = "+mul);
        System.out.println("div of two number="+" "+a+" and "+b+" = "+div);
        System.out.println("rem of two number="+" "+a+" and "+b+" = "+rem);
    }
    
}
