import java.util.*;
public class RemoveDuplication {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the Size of an arrays:");
        int n=src.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=src.nextInt();
        }
        System.out.println("Orignal arrays are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
       //1.st- Methods for the arrays 
       /* 
        int arr1[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr1[j]=arr[i];
                j++;
            }
        }
        arr1[j]=arr[arr.length-1];
        System.out.println("unick Arrays are:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+"   ");
        }
           
        */

        // 2nd methods for hash set

        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println("\n Remove duplication element of an arrays the elemnet are:");
        for(int el:hs){
            System.out.print(el+" ");
        }
        
    }


    
}
