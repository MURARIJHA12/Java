import java.util.*;
public class Rotate90 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of Row:");
        int n=src.nextInt();
        System.out.println("Enter the size of col:");
        int m=src.nextInt();
        int arr1[][]=new int[n][m];
        //int arr2[][]=new int[n][m];
        System.out.println("Enter the Element of 1st matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=src.nextInt();
            }
        }


        System.out.println("orignal  Element of 1st matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        //step 1:transpose of the Matrix:
        int arr2[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j]=arr1[j][i];
            }
        }

        System.out.println("Transpose of the Matrix::");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        //step 2:ROW by reverse an arrays

        for(int i=0;i<n;i++){
            int left=0,right=m-1;
            while(left<right){
                int temp=arr2[i][left];
                arr2[i][left]=arr2[i][right];
                arr2[i][right]=temp;
                left++;
                right--;
            }
        }
        System.out.println("Rotate 90 degree After the Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
