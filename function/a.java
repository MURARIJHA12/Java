import java.util.*;
class A{
    public static void factorial(int x){
        int i,fact=1;
        for(i=1;i<=x;i++){
            fact=fact*i;
        }
        System.out.print("product of two no="+fact);
    }
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the number=");
        int a=src.nextInt();
        factorial(a);
    }
}