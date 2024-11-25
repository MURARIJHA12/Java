package Assignement;

// find the smallest word in a sentence
import java.util.*;

public class Question08 {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String str = src.nextLine();
        
        // Split the input string into words
        String[] words = str.split(" ");
        // Initialize the smallest word to the first word in the array
        String smallestWord = words[0];
        
        // Loop through each word in the array
        for (int i = 1; i < words.length; i++) {
            // If the current word is shorter than the smallest word found so far
            if (words[i].length() < smallestWord.length()) {
                // Update the smallest word
                smallestWord = words[i];
            }
        }
        
        // Print the smallest word found
        System.out.println("The smallest word is: " + smallestWord);
        
        // Close the Scanner
        src.close();
    }
}
