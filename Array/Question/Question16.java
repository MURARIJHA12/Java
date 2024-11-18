
//Question :16. Store all the prime numbers found in between 1 - 100 in array.

public class Question16 {
	    public static void main(String[] args) {
	        int[] primeNumbers = new int[25]; // Array to hold prime numbers
	        int index = 0;

	        // Find and store prime numbers between 1 and 100
	        for (int i = 2; i <= 100; i++) { // Start from 2, as it's the first prime number
	            boolean isPrime = true; // Assume i is prime

	            for (int j = 2; j * j <= i; j++) { // Check divisibility
	                if (i % j == 0) {
	                    isPrime = false; // Not prime
	                    break; // No need to check further
	                }
	            }

	            if (isPrime) {
	                primeNumbers[index] = i; // Store prime number
	                index++; // Increment index
	            }
	        }

	        // Print the prime numbers
	        System.out.print("Prime numbers between 1 and 100: ");
	        for (int i = 0; i < index; i++) {
	            System.out.print(primeNumbers[i] + " ");
	        }
	    }
	}




