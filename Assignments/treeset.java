package programs;

import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> tree=new TreeSet<>();
        tree.add(20);
        tree.add(10);
        tree.add(40);
        tree.add(30);
        tree.add(10);
        tree.add(50);
        tree.add(20);
        System.out.println(tree);
    }
}
