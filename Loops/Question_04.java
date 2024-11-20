package Loops;
// Reverse of Digits
import java.util.*;
public class Question_04 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = src.nextInt(); // Use int for integer input
        int rem;
        int rev = 0;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println("Reversed number: " + rev);
    }
}
