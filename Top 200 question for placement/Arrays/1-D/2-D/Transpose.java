import java.util.*;

public class Transpose {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the Size of row in the matrix:");
        int n=src.nextInt();
        System.out.println("Enter the Size of col in the Matrix:");
        int m=src.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=src.nextInt();
            }
        }
        System.out.println("Before the transpose of the Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int arr1[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=arr[j][i];
            }
        }
        System.out.println("After Transopse of the Matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
