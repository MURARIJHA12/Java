import java.util.*;

class SearchElement {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        // Input array size
        System.out.println("Enter the size of the array:");
        int n = src.nextInt();
        int arr[] = new int[n];
        
        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = src.nextInt();
        }
        
        // Display the array
        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        int search=src.nextInt();

        Elemntsearch(arr,search);
    }
    public static void Elemntsearch(int arr[] ,int search ){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println("Element are existed:"+search);
            }
        }
    }
}
