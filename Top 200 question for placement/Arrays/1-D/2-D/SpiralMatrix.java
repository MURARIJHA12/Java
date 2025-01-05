import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        // Input for rows and columns
        System.out.println("Enter the Size of rows:");
        int n = src.nextInt();
        System.out.println("Enter the Size of columns:");
        int m = src.nextInt();

        // Matrix input
        int arr[][] = new int[n][m];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = src.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("Original matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Call the spiral function
        System.out.println("Spiral Order:");
        spiral(arr);
    }

    public static void spiral(int arr[][]) {
        int startRow = 0, startCol = 0;
        int endRow = arr.length - 1, endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            startRow++;

            // Right column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            endCol--;

            // Bottom row (if still valid)
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(arr[endRow][j] + " ");
                }
                endRow--;
            }

            // Left column (if still valid)
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(arr[i][startCol] + " ");
                }
                startCol++;
            }
        }
    }
}
