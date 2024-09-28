import java.util.*;

public class question3 {
    public static boolean palindrome(int n) {
        int original = n;
        int rev = 0;

        for (int i = n; i > 0; i /= 10) {
            int rem = i % 10;
            rev = rev * 10 + rem;
        }

        if (original == rev) {
           return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = src.nextInt();
        if(palindrome(n)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
