package programs;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class vectorsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Vector<Integer> vc=new Vector<Integer>(n);
        for(int i=0;i<n;i++){
            vc.add(sc.nextInt());
        }
        Collections.sort(vc);
        System.out.println(vc);
    }
}
