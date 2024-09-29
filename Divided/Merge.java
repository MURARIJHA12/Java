import java.util.Scanner;

public class Merge {

    // Function to perform merge sort on an array
    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid); // Sort the left part
        mergesort(arr, mid + 1, ei); // Sort the right part
        merge(arr, si, mid, ei); // Merge the sorted parts
    }

    // Function to merge two sorted halves of an array
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // Iterator for the left part
        int j = mid + 1; // Iterator for the right part
        int k = 0; // Iterator for the temp array

        // Merge the two parts into temp[]
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of the left part, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy the remaining elements of the right part, if any
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted elements back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = src.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = src.nextInt();
        }

        // Perform merge sort
        mergesort(arr, 0, arr.length - 1);

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Close the scanner
        src.close();
    }
}
