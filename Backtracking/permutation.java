import java.util.*;

public class permutation {
    public static void findPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcd" -> "ab" + "cd" = "abcd" without 'c'
            String newstr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newstr, ans + curr); 
        }
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = src.nextLine();
        findPermutation(str, "");
    }
}
