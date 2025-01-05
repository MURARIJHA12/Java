import java.util.*;

public class EqualOrNot {
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
        //find the length of an arrays
        int u=arr1.length;
        int v=arr2.length;
        //short the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
         int count=0;
        if(u==v){
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr2.length;j++){
                    if(arr1[i]==arr2[j]){
                        count++;
                    }
                }
            }
        }
        if(count>0){
            System.out.println("arrays are equal");

        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
