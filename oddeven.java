import java.util.Scanner;
public class oddeven {
    public static void main(String [] args){
        int N;
        System.out.println("Enter the value of number=");
        Scanner src=new Scanner(System.in);
        N=src.nextInt();
        if(N%2==0){
            System.out.println("number are even="+N);
        }
        else{
            System.out.println("number are odd="+N);
        }
    }
}
