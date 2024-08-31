import java.util.Scanner;
public class tribonacciseries {
    public static void main(String[] args) {
        int term,i,a=0,b=1,c=2,d;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the term of series");
        term=src.nextInt();
        for(i=1;i<=term;i++){
            System.out.print(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
    }
    
}
