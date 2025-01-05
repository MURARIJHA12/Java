import java.util.*;
public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the length of first arrays:");
        int n=src.nextInt();
        System.out.println("Enter the length of second arrays:");
        int m=src.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++){
            arr1[i]=src.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=src.nextInt();
        }
        System.out.println("First arrays are:");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+"  ");
        }
        System.out.println("\nsecond arrays are:");
        for(int i=0;i<m;i++){
            System.out.print(arr2[i]+"  ");
        }

        int u=m+n;
        int arr[]=new int[u];
        for(int i=0;i<n;i++){
            arr[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr[arr1.length+i]=arr2[i];
        }
        System.out.println("Merge of Two arrays:");
        for(int i=0;i<u;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
