package programs;

import java.util.Scanner;
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        Stack p=new Stack<>();
        for (char i: s.toCharArray()){
            p.push(i);

        }
        String temp="";
        while(!p.isEmpty()){
            temp+=p.pop();
        }
        System.out.println(temp);
    }
}
