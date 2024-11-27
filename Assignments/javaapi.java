package programs;

import java.util.*;
import java.util.stream.Collectors;


public class javaapi {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Avocado", "Apricot", "Berry", "Almond");
        List<String> fruit = fruits.stream().filter(i -> i.startsWith("A")).sorted().collect(Collectors.toList());
        System.out.println(fruit);
    }
}
