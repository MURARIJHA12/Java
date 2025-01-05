import java.util.*;

public class Sort {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n = src.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = src.nextInt();
        }
        
        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Sort the array in ascending order
        Arrays.sort(arr);
        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Sort the array in descending order
        
        int first = 0, last = arr.length - 1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        
        System.out.println("Sorted array in descending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
