import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        int n,i,count=0;
        Scanner src=new Scanner(System.in);
        System.out.println("enter the number=");
        n=src.nextInt();
        for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime number"+n);
        }
        else{
            System.out.println("number are not prime"+n);
        }
    }
    
}
