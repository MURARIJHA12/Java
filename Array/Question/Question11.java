

//Question: Deleting an element from an array

import java.util.Scanner;

public class Question11 {
	

	    // Function to delete an element from an array at a specified position
	    public static int[] deleteElement(int[] arr, int position) {
	        int n = arr.length;
	        if (position < 0 || position >= n) {
	            System.out.println("Invalid position!");
	            return arr;
	        }
	        
	        int[] newArr = new int[n - 1];
	        for (int i = 0, k = 0; i < n; i++) {
	            if (i == position) {
	                continue;
	            }
	            newArr[k++] = arr[i];
	        }
	        return newArr;
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

	        System.out.println("Enter the position of the element to delete:");
	        int position = src.nextInt();

	        int[] newArr = deleteElement(arr, position);

	        System.out.print("New array: ");
	        for (int i = 0; i < newArr.length; i++) {
	            System.out.print(newArr[i] + " ");
	        }
	        System.out.println();
	    }
	}



