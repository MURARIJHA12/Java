package Assignment;

// Method to Reverse an array
import java.util.Scanner;
import java.util.*;

public class Question07 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the Size of an Array:");
        int n = src.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = src.nextInt();
        }
        ReverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    public static void ReverseArray(int arr[]) {
        int first = 0;
        int least = arr.length - 1;
        while (first < least) {
            int temp = arr[least];
            arr[least] = arr[first];
            arr[first] = temp;
            first++;
            least--;
        }
    }
}
