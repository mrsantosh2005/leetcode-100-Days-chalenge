import java.util.*;

public class Day38 {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.offer(x);
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        // swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    // ✅ MAIN method for VS Code / Terminal testing
    public static void main(String[] args) {
        Day38 stack = new Day38();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.top()); // Output: 3
        System.out.println(stack.pop()); // Output: 3
        System.out.println(stack.top()); // Output: 2
        System.out.println(stack.empty()); // Output: false
    }
}
