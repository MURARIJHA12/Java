
//Check the String is Pallindrome
import java.util.Scanner;

public class Question02 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = src.nextLine().toLowerCase();
        palindrome(str);
    }

    public static void palindrome(String str) {
        int first = 0;
        int last = str.length() - 1;
        boolean isPalindrome = true;

        while (first < last) {
            if (str.charAt(first) != str.charAt(last)) {
                isPalindrome = false;
                break;
            }
            first++;
            last--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
