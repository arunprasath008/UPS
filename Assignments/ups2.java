package programs;

import java.util.ArrayList;
import java.util.Spliterator;

public class ups2 {
    public static void main(String[] args) {
        ArrayList<String> heros=new ArrayList<>();
        heros.add("saitama");
        heros.add("genos");
        heros.add("somic");
        System.out.println(heros);
        //remove
        heros.remove(2);

        //clone
        Object clone = heros.clone();
        System.out.println(clone);
        //spliterator
        heros.add("boros");
        Spliterator<String> hiii = heros.spliterator();
        hiii.forEachRemaining(System.out::println);
    }
}
