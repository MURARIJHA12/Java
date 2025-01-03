import java.util.*;

public class OddEven {

    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=src.nextInt();
        if(n%2==0){
            System.out.println(n+" is Even Number");
        }
        else{
            System.out.println(n+" is Odd Number");
        }
    }
    
}
