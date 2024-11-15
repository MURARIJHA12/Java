import java.util.*;
//Find The next greatest Element in the An Arrays: 
class Q05 {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreter[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // 1. Pop elements from the stack while the stack is not empty and the top element is less than or equal to the current element
            while (!s.empty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // 2. If the stack is empty, then no greater element to the right; else, the top element of the stack is the next greater element
            if (s.isEmpty()) {
                nxtGreter[i] = -1;
            } else {
                nxtGreter[i] = arr[s.peek()];
            }

            // 3. Push the current element index onto the stack
            s.push(i);
        }

        for (int i = 0; i < nxtGreter.length; i++) {
            System.out.print(nxtGreter[i] + " ");
        }
        System.out.println();
    }
}
