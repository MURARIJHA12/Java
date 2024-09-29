import java.util.*;

public class shorted_rotated {
    public static int search(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }

        //works
        int mid=si+(ei-si)/2;

        //case Found
        if(arr[mid]==tar){
            return mid;
        }

        //mid on line 1
        if(arr[si ]<=arr[mid]){
            //case 1:left
            if(arr[si]<=tar && tar<=arr[mid]){
              return  search(arr,tar,si,mid);
            }
            else{
                //case 2nd:right
               return search(arr, tar, mid+1, ei);
            }


        }
        //mid on line 2
        else{
            //case 3rd:right
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else{
                //case 4th:left
                return search(arr,tar,si,mid-1); 

            }

        }


    }
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the Size of an arrays=");
        int n=src.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=src.nextInt();
        }
        System.out.println("Enter the target Element=");
        int tar=src.nextInt();
        int tarIdx=search(arr,tar,0,arr.length-1);
        System.out.println(tarIdx);

    }
    
}
