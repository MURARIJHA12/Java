

//Question: An array is given. Find whether an element is even or odd if found even place it in another array and print it.

import java.util.Scanner;

public class Question12 {

	


	    // Function to find even elements and place them in a new array
	    public static int[] findEvenElements(int[] arr) {
	        int n = arr.length;
	        // First, count the number of even elements
	        int count = 0;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] % 2 == 0) {
	                count++;
	            }
	        }

	        // Create a new array to hold the even elements
	        int[] evenArr = new int[count];
	        int index = 0;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] % 2 == 0) {
	                evenArr[index++] = arr[i];
	            }
	        }

	        return evenArr;
	    }

	    public static void main(String[] args) {
	        Scanner src = new Scanner(System.in);

	        System.out.println("Enter the size of the array:");
	        int n = src.nextInt();

	        int arr[] = new int[n];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = src.nextInt();
	        }

	        System.out.print("Elements of the array: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();

	        // Find even elements and place them in a new array
	        int[] evenArr = findEvenElements(arr);   //calling the function

	        System.out.print("Even elements array: ");
	        for (int i = 0; i < evenArr.length; i++) {
	            System.out.print(evenArr[i] + " ");
	        }
	        System.out.println();
	    }
	}

	


