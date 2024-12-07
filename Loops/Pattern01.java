package Pattern;
import java.util.*;
public class Pattern01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner src=new Scanner(System.in);
     System.out.println("enter the value of n:");
     int n=src.nextInt();
     for(int i=1;i<=n;i++) {
    	 for(int j=1;j<=n-i;j++) {
    		 System.out.print(" ");
    	 }
    	 for(int j=i;j>=1;j--) {
    		 System.out.print(j);
    	 }
    	 for(int j=2;j<=i;j++) {
    		 System.out.print(j);
    	 }
    	 System.out.println();
     }
	}

}
