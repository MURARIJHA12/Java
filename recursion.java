/*public class recursion {
    public static void main(String[] args) {
        recursion ref=new recursion();
        int a=ref.sum(10);
        System.out.println("sum of first 10 number="+" "+a);
    }
    int sum(int b){
        if(b>0){
            return b+sum(b-1);
        }
        else{
            return 0;
        }
    }
     }

*/

//factorial of n natural no

import java.util.Scanner;
public class recursion {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the no=");
        Scanner src=new Scanner(System.in);
        n=src.nextInt();
        recursion obj=new recursion();
        int result=obj.fact(n);
        System.out.println("Factorial of given no="+result);
}
int fact(int n){
    if(n==1){
        return 1;
    }
    else{
        return n*fact(n-1);
    }
}
}
