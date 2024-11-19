
//count duplicatin element in an arrays
import java.util.Scanner;

public class Question_01 {

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner src = new Scanner(System.in);
        
        System.out.println("Enter the size of an array:");
        
        int n = src.nextInt();  // Read array size
        
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array:");
        
        // Populate the array
        for(int i = 0; i < arr.length; i++) {
            arr[i] = src.nextInt();
        }
        
        System.out.println("Original array:");
        
        // Print the original array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Find the maximum element in the array to create a frequency array
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        
        // Create a frequency array
        int freq[] = new int[max + 1];
        
        // Count the frequency of each element in the original array
        for(int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        
        System.out.println("Count of each element:");
        
        // Print the frequency of each element
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > 0) {
                System.out.println(i + " appears " + freq[i] + " time(s).");
            }
        }
    }
}
