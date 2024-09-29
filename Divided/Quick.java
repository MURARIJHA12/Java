import java.util.*;

public class Quick {
    // Main quicksort method
    public static void Quickshort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // Partition the array
        int pidx = partition(arr, si, ei);
        Quickshort(arr, si, pidx - 1); // Sort left part
        Quickshort(arr, pidx + 1, ei); // Sort right part
    }

    // Partition method
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // Pivot element
        int i = si - 1; // Place for the smaller elements

        for (int j = si; j < ei; j++) { // Loop through the array
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Swap the pivot element with the element at i + 1
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i; // Return the pivot index
    }

    // Method to print the array
    public static void print(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = src.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = src.nextInt();
        }
        Quickshort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        print(arr);
    }
}
