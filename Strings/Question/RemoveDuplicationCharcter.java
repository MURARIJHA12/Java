import java.util.*;

class RemoveDuplicationCharcter {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        // Taking input for string
        System.out.println("Enter the String:");
        String str = src.nextLine();
        
        char arr[] = str.toCharArray(); // Convert string to char array
        int n = arr.length;
        char arr1[] = new char[n]; // Store unique characters
        
        int k = 0; // To track unique characters

        // Removing duplicate characters
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < k; j++) {
                if (arr[i] == arr1[j]) {
                    isDuplicate = true;
                    break; // Stop checking if found duplicate
                }
            }
            if (!isDuplicate) {
                arr1[k] = arr[i];
                k++;
            }
        }

        // Displaying unique elements
        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
