import java.util.Scanner;
public class Tiling_problem {
    public static int tiling(int n){
        //base case;
        if(n==0||n==1){
             return 1;
        }
          //kam
          //vertical choice
          int frm1=tiling(n-1);

          //horizontal choice
          int frm2=tiling(n-2);
          
          int totalways=frm1+frm2;
          return totalways;
    }
    public static void main(String [] args){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of flore=");
        int n=src.nextInt();
        System.out.println(tiling(n));
    }
    
}
