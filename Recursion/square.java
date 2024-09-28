import java.util.*;
public class square {
    public static int square(int n,int pow){
        if(pow==0){
           return 1;
        }
        int xnm1=square(n,pow-1);
        int xn=n*xnm1;
        return xn;
    }
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the number=");
        int n=src.nextInt(); 
        System.out.println("Enter the power");
        int pow=src.nextInt();
        System.out.println(square(n, pow));
    }
    
}
  