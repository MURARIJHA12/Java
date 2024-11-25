package Assignement;
//find the largest word in a sentence
import java.util.*;

public class Question07 {

 public static void main(String[] args) {
     // Create a Scanner object to read input
     Scanner src = new Scanner(System.in);
     System.out.println("Enter the String:");
     String str = src.nextLine();
     
     // Find and print the largest word in the input string
     System.out.println("The largest word is: " + findLargestWord(str));
     
     // Close the Scanner
     src.close();
 }

 public static String findLargestWord(String str) {
     // Split the input string into words
     String[] words = str.split(" ");
     // Initialize the largest word to an empty string
     String largestWord = "";
     
     // Loop through each word in the array
     for (String word : words) {
         // If the current word is longer than the largest word found so far
         if (word.length() > largestWord.length()) {
             // Update the largest word
             largestWord = word;
         }
     }
     
     // Return the largest word found
     return largestWord;
 }
}
