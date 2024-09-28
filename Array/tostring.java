
import java.util.Arrays;
public class tostring {
    public static void main(String[] args) {
        String arr[]={"murari","kumar","jha","as","a","Student"};
        System.out.println(" toString()Method"+" "+Arrays.toString(arr));
        System.out.println("aslist() method"+" "+Arrays.asList(arr));
        int a[][]={{10,20},{30,40}};
        System.out.println("deeptostring()"+" "+Arrays.deepToString(a));
    }
}
