

// Question .Duplet Sum : If a value is given then have to print all the pair elements whose sum will be equal to that value {10, 20, 30, 40, 50, 60} => 70 {10, 60}, {20, 50}, {30, 40}
import java.util.*;

public class Question08 {

    // Function to count pairs and print them
    public static int CountPairs(int arr[], int target) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("{" + arr[i] + ", " + arr[j] + "}");
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Enter the Size of an Arrays:");
        int n = src.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Element of an Arrays:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = src.nextInt();
        }

        System.out.print("Elements of the Arrays: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the target sum:");
        int target = src.nextInt();

        int count = CountPairs(arr, target);   //call of function 
        
        System.out.println("Total pairs: " + count);
    }
}
