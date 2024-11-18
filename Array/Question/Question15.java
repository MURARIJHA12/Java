
//Question :. Convert a number in binary and store it an array and then count the number of 1's and 0's present in the array and print it.   

import java.util.Scanner;

public class Question15 {

	    // Function to convert a number to binary and count 1's and 0's
	    public static void convertToBinary(int number) {
	    	
	        // Calculate the number of bits required
	        int bits = (int) (Math.log(number) / Math.log(2)) + 1;
	        int[] binaryArray = new int[bits];

	        // Convert to binary and store in array
	        for (int i = bits - 1; i >= 0; i--) {
	        	
	            binaryArray[i] = number % 2;  // Get the least significant bit
	            
	            number = number / 2;           // Divide the number by 2
	        }

	        // Count 1's and 0's
	        int countOnes = 0;
	        int countZeros = 0;

	        for (int bit : binaryArray) {
	            if (bit == 1) {
	                countOnes++;
	            } else {
	                countZeros++;
	            }
	        }

	        // Print the binary array
	        System.out.print("Binary representation: ");
	        for (int bit : binaryArray) {
	            System.out.print(bit);
	        }
	        System.out.println();
	        
	        // Print counts of 1's and 0's
	        System.out.println("Number of 1's: " + countOnes);
	        System.out.println("Number of 0's: " + countZeros);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a number to convert to binary:");
	        int number = scanner.nextInt();

	        convertToBinary(number);
	    }
	}



