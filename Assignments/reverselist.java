package programs;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class reverselist {
    public static void main(String[] args) {
        List<Integer> lo= new ArrayList<>();
        lo.add(3);
        lo.add(2);
        lo.add(1);
        lo.add(93);
        lo.add(3);
        List<Integer>uu=new ArrayList<>();
        uu.add(3);
        uu.add(1);
        //Shuffle list
        Collections.shuffle(lo);
        System.out.println(lo);
        System.out.println("Reversed list" + lo.reversed());
        Set<Integer> set = new HashSet<>(lo);
        System.out.println("Duplicates removed" + set);
        lo.retainAll(uu);
        System.out.println(lo);


        }
    }

