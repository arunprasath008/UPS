package programs;

import java.util.Stack;

public class stacksort {
    public static void sortt(Stack<Integer>s){
        int n=s.pop();
        if(s.size()!=1){
            sortt(s);
        }
        insert(s,n);
    }
    public static void insert(Stack<Integer>s,Integer n){
        if (s.isEmpty() || n > s.peek())
        {
            s.push(n);
            return;
        }
        int top = s.pop();
        insert(s,n);
        s.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(12);
        st.push(13);
        st.push(2);
        st.push(1);
        st.push(3);

        System.out.print(st);
        sortt(st);
        System.out.println();
        System.out.print(st);

    }
}
