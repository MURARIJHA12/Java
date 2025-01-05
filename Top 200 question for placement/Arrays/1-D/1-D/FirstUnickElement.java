import java.util.*;

public class FirstUnickElement {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the Size of an arrays:");
        int n=src.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=src.nextInt();
        }
        System.out.println("Orignal Element of an arrays:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int arr1[]=new int[1];
        for(int i=0;i<=n;i++){
            if(arr[i]!=arr[i+1]){
                //System.out.println(arr[i]);
                arr1[i]=arr[i];
            }
        }
        System.out.print(arr1);
    }
}
