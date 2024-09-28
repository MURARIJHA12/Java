import java.util.*;
public class sorted {
    
    public static boolean shorted(int arr[],int i)
    {
        if(i==arr.length-1){
            return true;
        }
         if(arr[i]>arr[i+1]){
            return false;
         }
         return shorted(arr, i+1);
    }

    public static void main(String[] args) {
        
        Scanner src=new Scanner(System.in);
        System.out.println("Enetr the size of an array=");
        int n=src.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=src.nextInt();
        }
        System.out.println(shorted(arr, 0));
        
    }
    
}
