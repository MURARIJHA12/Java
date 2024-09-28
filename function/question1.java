import java.util.Scanner;

public class question1 {

    // Method to calculate and print the average
    public static void average(int a, int b, int c) {
        int sum = a + b + c;
        float average = sum / 3.0f; // Use 3.0f to ensure float division
        System.out.println("The average is: " + average);
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the three numbers: ");
        int a = src.nextInt();
        int b = src.nextInt();
        int c = src.nextInt();

        // Call the average method
        average(a, b, c);
    }
}
