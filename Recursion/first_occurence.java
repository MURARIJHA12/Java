import java.util.*;
public class first_occurence {
    public static int occurence(int arr[], int search,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==search){
            return i;

        }
    return occurence(arr,search,i+ 1);

    }
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an aaray=");
        int n=src.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=src.nextInt();
        }
        System.out.println("Enter the search number=");
        int search=src.nextInt();
        System.out.println(occurence(arr, search,0));
    }
}
