import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the Size of an Arrays:");
        int n=src.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Element of an arrays:");
        //store the elemnt of an arrays
        for(int i=0;i<n;i++){
            arr[i]=src.nextInt();
            
        }
        System.out.println("Orognal Element of an arrays:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        //average of possitive no
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                sum=sum+arr[i];
                count++;
            }
        }
        double avg=(sum)/count;
        System.out.println("\n Average of Possitive no="+avg);
    }
}