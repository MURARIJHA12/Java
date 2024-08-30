import java.util.Scanner;
public class bigestelementarray {
    public static void main(String[] args) {
        int i,n,max,temp;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        n=src.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=src.nextInt();
        }
        System.out.println("orignal Array=");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        max=arr[0];
        for(i=0;i<n;i++){
            if(max<arr[i]){
                temp=max;
                max=arr[i];
                arr[i]=temp;
            }
System.out.println("");
        }
        System.out.println("Maxiumum Element in the arry"+" "+max);

    }
    
}
