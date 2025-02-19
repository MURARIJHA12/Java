import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = src.nextLine();
        src.close();  
        char arr[] = str.toCharArray();
        int n = str.length();
        int k = 0;
        char arr1[] = new char[n];  

        for (int i = 0; i < n; i++) {
            boolean IsDuplication = false;
            
            for (int j = 0; j < k; j++) {  
                if (arr[i] == arr1[j]) {  
                    IsDuplication = true;
                    break;
                }
            }

            
            if (!IsDuplication) {
                arr1[k] = arr[i];
                k++;
            }
        }
        System.out.println("String after removing duplicate characters:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr1[i]);
        }
    }
}
