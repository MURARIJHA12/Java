import java.util.Scanner;
public class armstrome {
    public static void main(String [] args){
        int n,i,rem,arrm=0;
        Scanner src=new Scanner(System.in);
        System.out.println("enter the number");
        n=src.nextInt();
        for(i=n;i>0;i=i/10){
            rem=i%10;
            arrm=(rem*rem*rem)+arrm;

        }
        if(arrm==n){
            System.out.println("number are armstrome"+n);
        }
        else{
            System.out.println("number are not Armstrone");
        }
    }
}
