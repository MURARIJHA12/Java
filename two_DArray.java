//diginig the matrix of m*n size

/* 
import java.util.Scanner;
public class two_DArray {
    public static void main(String[] args) {
        int row,col;
        Scanner src=new Scanner(System.in);
        System.out.print("Enter the no of row=");
        row=src.nextInt();
        System.out.println("Enter the no of colum=");
        col=src.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=src.nextInt();
            }
        }
        System.out.println("the matrix are=");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

*/

// Question-2. Addition of Matrix;

/* 
import java.util.Scanner;
public class two_DArray {
    public static void main(String[] args) {
        int row,col,i,j;
        Scanner src=new Scanner(System.in);
        System.out.print("Enter the no of row=");
        row=src.nextInt();
        System.out.println("Enter the no of colum=");
        col=src.nextInt();
        int mat1[][]=new int[row][col];
        for( i=0;i<row;i++){
            for(j=0;j<col;j++){
                mat1[i][j]=src.nextInt();
            }
        }
        System.out.println("the 1st matrix are=");
        for( i=0;i<row;i++){
            for( j=0;j<col;j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }
        int mat2[][]=new int[row][col];
        for( i=0;i<row;i++){
            for( j=0;j<col;j++){
                mat2[i][j]=src.nextInt();
            }
        }
        System.out.println("the 2nd matrix are=");
        for( i=0;i<row;i++){
            for( j=0;j<col;j++){
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }
        int sum[][]=new int[row][col];
      
        for( i=0;i<row;i++){
            for( j=0;j<col;j++){
                sum[i][j]=mat1[i][j]+mat2[i][j];
            }
    
        }

        System.out.println("the sum of two matrix are=");
        for( i=0;i<row;i++){
            for( j=0;j<col;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}

*/

//Question-3:Transpose of an matrix;
/* 
import java.util.Scanner;

public class two_DArray {
    public static void main(String[] args) {
        int row, col, i, j;
        Scanner src = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        row = src.nextInt();
        System.out.println("Enter the number of columns: ");
        col = src.nextInt();
        
        int arr[][] = new int[row][col];
        
        System.out.println("Enter the elements of the matrix:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = src.nextInt();
            }
        }
        
        System.out.println("The original matrix is:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        int trans[][] = new int[col][row]; 
        
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                trans[j][i] = arr[i][j]; 
            }
        }
        
        System.out.println("The transpose of the matrix is:");
        for (i = 0; i < col; i++) { 
            for (j = 0; j < row; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/

//Question-4. Multiplication of two matrix;

import java.util.Scanner;

public  class two_DArray {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        
        System.out.print("Enter the number of rows in the first matrix: ");
        int row1 = src.nextInt();
        System.out.print("Enter the number of columns in the first matrix: ");
        int col1 = src.nextInt();

        int mat1[][] = new int[row1][col1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                mat1[i][j] = src.nextInt();
            }
        }

        System.out.print("Enter the number of rows in the second matrix: ");
        int row2 = src.nextInt();
        System.out.print("Enter the number of columns in the second matrix: ");
        int col2 = src.nextInt();

        if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible. The number of columns in the first matrix must equal the number of rows in the second matrix.");
            return;
        }

        int mat2[][] = new int[row2][col2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                mat2[i][j] = src.nextInt();
            }
        }

        
        int result[][] = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < col1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("The product of the matrices is:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
