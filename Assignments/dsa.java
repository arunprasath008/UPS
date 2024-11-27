import java.util.Stack;

public class dsa {
    public static void main(String[] args) {
        String s="()(()(())";
        int max=0;
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char b=s.charAt(i);
            if (b == '(') {
                stack.push(b);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(b);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        System.out.println(max);
    }
}
//()(()(())