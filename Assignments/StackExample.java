package programs;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            st.push(a);
            if(a <= min) {
                min = a;
            }
        }
        System.out.println("Stack: " + st);
        System.out.println(min);
        for(int i = 0; i < 5; i++) {
            int b = st.pop();
            System.out.println(st);
            if(min == b) {
                System.out.println("Stack after popping minimum: " + st);
                break;
            }
        }
    }
}