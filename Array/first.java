package Array;
import java.util.*;
public class first {
    public static void main(String[] args){
        int i,size;
        Scanner src=new Scanner(System.in);
        System.out.println("EDnter the Size of an arry");
        size=src.nextInt();
        int arr[]=new int [size];
        for(i=0;i<size;i++){
        arr[i]=src.nextInt();
        }
        System.out.println("printed array are=");
        for(i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        
    }
}
