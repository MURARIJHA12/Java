import java.util.ArrayList;

public class implement {
    public static class Stack {
        public  ArrayList<Integer> list = new ArrayList<>();

        // Check if the stack is empty
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // Push element onto the stack
        public void push(int data) {
            list.add(data);
        }

        // Pop element from the stack
        public int pop() { 
            if (!isEmpty()) {
                int top = list.get(list.size() - 1);
                list.remove(list.size() - 1);
                return top;
            } else {
                throw new IllegalStateException("Stack is empty");
            }
        }

        // Peek at the top element of the stack
        public int peek() {
            if (!isEmpty()) {
                return list.get(list.size() - 1);
            } else {
                throw new IllegalStateException("Stack is empty");
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3); 
        s.push(4);
        s.push(5);
        s.pop();

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
