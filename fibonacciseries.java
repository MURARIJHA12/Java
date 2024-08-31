//fibonacciseries- 0,1,1,2,3,5,8,13,21


import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args) {
        int Range,i,a=0,b=1,c;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the Range=");
        Range=src.nextInt();
        for(i=1;i<=Range;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
           
        }
    }
    
}
