import java.util.*;
public class array_reverse {
    public static void main(String[] args) {
        int i ,rev,size;
        System.out.println("Enter the Size of an array");
        Scanner src=new Scanner(System.in);
        size=src.nextInt();
        int arr[]=new int[size];
        for(i=0;i<size;i++){
            arr[i]=src.nextInt();
        }
        System.out.println("orignal  array are"+" ");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
            System.out.println();
        }
        System.out.println("reverse of an array=");
        for(i=size-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
