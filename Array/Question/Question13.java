


//Question: Find the duplicates and print the sum of the duplicate elements.


import java.util.Arrays;
import java.util.Scanner;

public class Question13 {

    // Function to find duplicates and return their sum
    public static int findDuplicateSum(int[] arr) {
        Arrays.sort(arr);  // Sort the array to bring duplicates together
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {  // Check if the current element is the same as the next element
                sum += arr[i];
                // Skip all duplicate elements
                while (i < n - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = src.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = src.nextInt();
        }

        System.out.print("Elements of the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Find duplicates and their sum
        int duplicateSum = findDuplicateSum(arr);
        System.out.println("Sum of duplicate elements: " + duplicateSum);
    }
}
