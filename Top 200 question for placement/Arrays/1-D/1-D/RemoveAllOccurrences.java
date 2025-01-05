import java.util.*;

public class RemoveAllOccurrences {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        // Input array size
        System.out.println("Enter the size of the array:");
        int n = src.nextInt();
        int arr[] = new int[n];
        
        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = src.nextInt();
        }

        // Display original array
        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Input the key to remove
        System.out.println("\nEnter the key to remove:");
        int key = src.nextInt();

        // Create a list to store the remaining elements
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != key) {
                resultList.add(arr[i]);
            }
        }

        // Convert list back to array (optional)
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        // Display the result
        System.out.println("Array after removing all occurrences of the key:");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}
