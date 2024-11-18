

import java.util.Scanner;

public class Question17 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Enter the Size of the Array:");
        int n = src.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = src.nextInt();
        }

        System.out.print("\nOriginal elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int sumEvenIndex = 0;
        int sumOddIndex = 0;

        System.out.println("\n\nElements at even indices:");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
            sumEvenIndex += arr[i]; // Add to sum for even indices
        }

        System.out.println("\n\nElements at odd indices:");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
            sumOddIndex += arr[i]; // Add to sum for odd indices
        }

        // Print the sums
        System.out.println("\n\nSum of elements at even indices: " + sumEvenIndex);
        System.out.println("Sum of elements at odd indices: " + sumOddIndex);
    }
}
