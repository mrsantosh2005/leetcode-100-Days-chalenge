import java.util.Stack;

public class Day39 {

    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    // ✅ MAIN method for VS Code / Terminal testing
    public static void main(String[] args) {
        Day39 queue = new Day39();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.peek()); // Output: 1
        System.out.println(queue.pop());  // Output: 1
        System.out.println(queue.empty()); // Output: false
    }
}
