import java.util.*;
public class first_n_even_no {
    public static void main(String[] args){
        int n,i,even;
        System.out.println("Enter the first n natural number=");
        Scanner src=new Scanner(System.in);
        n=src.nextInt();
        System.out.println("first n number of even=");
        for(i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
