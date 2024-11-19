import java.util.*;
//Spiral matrix

public class Question_02 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the Row size of the array:");
        int n = src.nextInt();
        System.out.println("Enter the Column size of the array:");
        int m = src.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter the Elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = src.nextInt();
            }
        }

        System.out.println("Original matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        // Spiral matrix
        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = m - 1;

        System.out.println("Spiral order is:");
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

            // Bottom row (if still within bounds)
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(arr[endRow][j] + " ");
                }
                endRow--;
            }

            // Left column (if still within bounds)
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(arr[i][startCol] + " ");
                }
                startCol++;
            }
        }

        // Close the Scanner
        src.close();
    }
}

    

