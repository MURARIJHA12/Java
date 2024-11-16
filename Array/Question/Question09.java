

// Question: Triplet Sum: If a value is given, then print all the triplet elements whose sum will be equal to that value
import java.util.*;

public class Question09 {

    // Function to count triplets and print them
    public static int CountTriplets(int arr[], int target) {
        int n = arr.length;
        int count = 0;
        
        // Sorting the array to use two pointers approach
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    System.out.println("{" + arr[i] + ", " + arr[left] + ", " + arr[right] + "}");
                    count++;
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = src.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = src.nextInt();
        }

        System.out.print("Elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the target sum:");
        int target = src.nextInt();

        int count = CountTriplets(arr, target);
        System.out.println("Total triplets: " + count);
    }
}
