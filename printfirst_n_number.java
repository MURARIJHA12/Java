import java.util.Scanner;
public class printfirst_n_number {
    public static void main(String[] args){
        int i,n;
        System.out.println("Enter the value of n=");
        Scanner src=new Scanner(System.in);
        n=src.nextInt();
        for(i=1;i<=n;i++){
            System.out.println(i);
        }

    }
}
