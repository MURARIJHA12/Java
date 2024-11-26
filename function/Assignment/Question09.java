package Assignment;
// Find the greatest common factor (GCF)
import java.util.Scanner;

public class Question09 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n = src.nextInt();
        System.out.println("Enter the second number:");
        int m = src.nextInt();
        int gcf = findGCF(n, m);
        System.out.println("The greatest common factor is: " + gcf);
    }
    public static int findGCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
