import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an Arrays:");
        int n=src.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=src.nextInt();
        }
        System.out.println("orignal arrays are:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }

        //reverse of an arrays

        /* 
        System.out.println("Reverse arrays are:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
     
        */
        int first=0,least=arr.length-1;
        while(first<least){
            int temp=arr[least];
            arr[least]=arr[first];
            arr[first]=temp;
            first++;
            least--;
        }
        System.out.println("Reverse of an arrays are:");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    
}
