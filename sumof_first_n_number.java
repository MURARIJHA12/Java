import java.util.Scanner;
public class sumof_first_n_number {
    public static void main(String[] args){
        int n,i,sum=0;
        System.out.println("enter the value of n=");
        Scanner src=new Scanner(System.in);
        n=src.nextInt();
        for(i=1;i<=n;i++){
            sum=sum+i;
    
        }
        System.out.println("sum of first n number="+sum);
    }
    
}
