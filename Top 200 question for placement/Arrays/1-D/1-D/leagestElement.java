import java.util.*;

public class leagestElement {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an arrays:");
        int n=src.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=src.nextInt();
        }
        System.out.println("orinal element of an arrays:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
        
        //1st Method
        /* 
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element of an arrays"+max);

        */

        //2nd method->Arrays short and least element display kar do

        Arrays.sort(arr);
        System.out.print(arr[arr.length-1]);

    }
    
}
