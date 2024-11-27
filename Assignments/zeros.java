package programs;
import java.util.*;
import java.util.Scanner;

public class zeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s = s.replaceFirst ("^0+(?!$)", "");
        if (s.isEmpty()) {s = "0";
            System.out.println(s);}
        else{
            System.out.println(s);
        }
    }
}
