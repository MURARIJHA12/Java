import java.util.Scanner;
public class factor {
    public static void main(String[] args){
     int i,n;
     Scanner src=new Scanner(System.in);
     System.out.println("Enter the number=");
     n=src.nextInt();
     for(i=1;i<=n;i++){
        if(n%i==0){
            System.out.println(i+" ");
        }
     }
    }
}
