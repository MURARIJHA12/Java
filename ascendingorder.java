import java.util.Scanner;

public class ascendingorder {
    public static void main(String[] args) {
        int n, i, j, temp;
        Scanner Src = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = Src.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            arr[i] = Src.nextInt();
        }

        System.out.println("Original numbers in the array:");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        // Sorting the array in ascending order
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in ascending order:");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        Src.close();
    }
}
