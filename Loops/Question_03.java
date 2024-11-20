package Loops;
import java.util.Scanner;
//count the element in the numbers
public class Question_03 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = src.nextInt();
        System.out.println("Enter the value of key:");
        int key = src.nextInt();
        
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == key) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("The digit " + key + " appears " + count + " times in the number.");
        
        src.close();
    }
}
