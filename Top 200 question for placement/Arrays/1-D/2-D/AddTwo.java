import java.util.Scanner;

class AddTwo{
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of Row:");
        int n=src.nextInt();
        System.out.println("Enter the size of col:");
        int m=src.nextInt();
        int arr1[][]=new int[n][m];
        int arr2[][]=new int[n][m];
        System.out.println("Enter the Element of 1st matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=src.nextInt();
            }
        }
        System.out.println("Enter the Element of 2nd matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j]=src.nextInt();
            }
        }

        System.out.println(" the orignal  Element of 1st matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(" the orignal  Element of 2nd matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }


        int result[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        System.out.println(" the result of matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }


    }
}
