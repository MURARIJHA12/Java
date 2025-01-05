
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int r1,c1,r2,c2;
    Scanner src=new Scanner (System.in);
    System.out.println("Enter the size of row in first Matrix:");
    r1=src.nextInt();
    System.out.println("Enter the size of col in first Matrix:");
    c1=src.nextInt();
    System.out.println("Enter the size of row in second Matrix:");
    r2=src.nextInt();
    System.out.println("Enter the size of col in second Matrix:");
    c2=src.nextInt();
    if(c1!=r2) {
    	System.out.println("Multiplication is not possible");
    }
    else {
    	int a[][]=new int[r1][c1];
    	int b[][]=new int[r2][c2];
    	int c[][]=new int[r1][c2];
    	System.out.println("Enter the element of first matrix ");
    	for(int i=0;i<r1;i++) {
    		for(int j=0;j<c1;j++) {
    			a[i][j]=src.nextInt();
    		}
    	}
    	System.out.println("Enter the element of second matrix ");
    	for(int i=0;i<r2;i++) {
    		for(int j=0;j<c2;j++) {
    			b[i][j]=src.nextInt();
    		}
    	}
    	System.out.println("Multiplication of the matrix:");
    	for(int i=0;i<r1;i++) {
    		for(int j=0;j<c2;j++) {
    			c[i][j]=0;
    			for(int k=0;k<c1;k++) {
    				c[i][j]+=a[i][k]*b[k][j];
    			}
    			System.out.print(c[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
	}

}
