import java.util.*;
public class RotateArrays {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        // Array size input
        System.out.println("Enter the size of the array:");
        int n = src.nextInt();
        int arr[] = new int[n];

        // Array elements input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = src.nextInt();
        }

        // Display original array
        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Input k
        System.out.println("\nEnter the value of k:");
        int k = src.nextInt();

        // Normalize k (to handle cases where k > n or k < 0)
        k = k % n;
        if (k < 0) {
            k += n;
        }

        // Step 1: Reverse the entire array
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("\nArray after reversing entire array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Step 2: Reverse the first k elements
        for (int i = 0, j = k - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("\nArray after reversing first " + k + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Step 3: Reverse the remaining n-k elements
        for (int i = k, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("\nArray after reversing last " + (n - k) + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Final rotated array
        System.out.println("\nFinal rotated array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
