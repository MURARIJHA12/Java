import java.util.*;
class Fibonacci {
    public static void main(String args[]) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the Fibonacci number:");
        int n = src.nextInt();
        int first = 0, second = 1, curr = 0;

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else if (n == 1) {
            System.out.println("The " + n + "th Fibonacci number is: " + first);
        } else if (n == 2) {
            System.out.println("The " + n + "th Fibonacci number is: " + second);
        } else {
            for (int i = 3; i <= n; i++) {
                curr = first + second;
                first = second;
                second = curr;
            }
            System.out.println("The " + n + "th Fibonacci number is: " + curr);
        }
    }
}
