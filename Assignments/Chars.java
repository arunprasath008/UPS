package programs;

import java.util.Stack;

public class Chars {
    public static boolean palindrome(String a){
        int m=a.length();
        boolean b= true;
        for(int i=0;i<m/2;i++){
            if(a.charAt(i)!=a.charAt(m-1-i)){
                b=false;
                break;
            }
        }
        return b;
    }
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{')
                st.push(it);
            else {
                if(st.isEmpty()) return false;
                char ch = st.pop();
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{'));
                else return false;
            }
        }
        return st.isEmpty();
    }


    public static void main(String[] args) {
        String b="malayalam";
        System.out.println(palindrome(b));
        for(int i=b.length()-1;i>=0;i--){
            System.out.print(b.charAt(i));
        }
        System.out.println();
        String s="()[{}()]";
        if(isValid(s)==true)
            System.out.println("True");
        else
            System.out.println("False");

    }
}
