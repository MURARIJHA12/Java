import java.util.Scanner;

//rotate the kth element in an arrays
public class Question_04 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner src = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = src.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = src.nextInt();
        }
 
       System.out.println("Original elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Get number of rotations
        System.out.println("Enter the number of rotations:");
        int k = src.nextInt();
        
        // Ensure k is within the bounds of the array length
        k = k % n; // In case k is larger than the array length

        // Perform the rotation using reversal method
        
        // Step 2: Reverse the first k elements
        reverseArray(arr, 0, k - 1);
        
        // Step 3: Reverse the remaining elements
        reverseArray(arr, k, n - 1);
     
        // Step 1: Reverse the entire array
        reverseArray(arr, 0, n - 1);
        System.out.println("Array after " + k + " rotations:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function to reverse a part of the array
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

    

