import java.util.*;
public class PrimeCoprime {
    public static void main(String args[]){
        Scanner src=new Scanner (System.in);
        System.out.println("Enter the value of n");
        int n= src.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                // System.out.println("prime no");
                count++;
            }
            
        }
        if(count>0){
           System.out.println("coprime no"); 
        }
        else{
             System.out.println("prime no");
        }
    }
}
