import java.util.Scanner;

public class RemoveDuplication {
    public static void duplication(String str, int idx, StringBuilder newstr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        // Work
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            // duplicate
            duplication(str, idx + 1, newstr, map);
        } else {
            map[currChar - 'a'] = true;
            duplication(str, idx + 1, newstr.append(currChar), map);
        }
    }

    public static void main(String[] args) {  
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the original String=");
        String str = src.nextLine();
        duplication(str, 0, new StringBuilder(""), new boolean[26]);
        src.close();
    }
}
