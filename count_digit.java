import java.util.Scanner;
public class count_digit {
    public static void main(String args[]){
        int n,count=0;
        System.out.println("Enter the number=");
        Scanner src=new Scanner(System.in);
        n=src.nextInt();
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("this no are digit "+count);
    }
}
