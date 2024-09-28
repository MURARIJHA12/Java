import java.util.*;
public class factoral {
    public static int fact(int n){
       
        if(n==0){
            
            return 1;
        }
        int fnm1=fact(n-1);
       int fn=n*fact(n-1);
       return fn; 
    
        
    }
    

    
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the number =");
        int n=src.nextInt();
         System.out.println(fact(n));
         
    }
    
}
