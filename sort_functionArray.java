import java.util.Scanner;
import java.util.Arrays;
public class sort_functionArray {
    public static void main(String[] args) {
        int i,size;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter theb size of an array");
        size=src.nextInt();
        int arr[]=new int[size];
        for(i=0;i<arr.length;i++){
            arr[i]=src.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("shored array=");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
