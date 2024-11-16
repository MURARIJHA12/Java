
 
//question :Inserting a new element in  an array

import java.util.Scanner;
	

	public class Question10 {

	    // Function to insert a new element into an array at a specified position
	    public static int[] insertElement(int[] arr, int element, int position) {
	        int n = arr.length;
	        int[] newArr = new int[n + 1];

	        for (int i = 0; i < position; i++) {
	            newArr[i] = arr[i];
	        }
	        newArr[position] = element;
	        for (int i = position; i < n; i++) {
	            newArr[i + 1] = arr[i];
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

	        System.out.println("Enter the element to insert:");
	        int element = src.nextInt();

	        System.out.println("Enter the position to insert the element:");
	        int position = src.nextInt();

	        if (position < 0 || position > n) {
	            System.out.println("Invalid position!");
	        } else {
	            int[] newArr = insertElement(arr, element, position); //call

	            System.out.print("New array: ");
	            for (int i = 0; i < newArr.length; i++) {
	                System.out.print(newArr[i] + " ");
	            }
	            System.out.println();
	        }
	    }
	}



