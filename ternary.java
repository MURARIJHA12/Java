import java.util.Scanner;
public class ternary {
    public static void main(String[] args){
        int x,y,z,max;
        System.out.println("enter the value of x=");
        Scanner src=new Scanner(System.in);
        x=src.nextInt();
        System.out.println("Enter the value of y=");
        Scanner src1=new Scanner(System.in);
        y=src1.nextInt();
        System.out.println("Enter the value of z=");
        Scanner src2=new Scanner(System.in);
        z=src2.nextInt();

        max=(x>y)?(x>z?x:z):(y>z?y:z);//(ternary operators)
        
        System.out.println("Maximum of two integer="+max);
    }
}
