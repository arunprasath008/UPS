import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack elements: " + stack);
        System.out.println("Total elements in stack: " + stack.size());
    }
}
