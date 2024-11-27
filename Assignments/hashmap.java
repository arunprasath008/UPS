package programs;

import java.util.*;

public class hashmap {
    public static void find(HashMap<Integer, String> map1, HashMap<Integer, String> map2) {
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            Integer key = entry.getKey();
            String value1 = entry.getValue();
            String value2 = map2.get(key);
            if (!value1.equals(value2)) {
                System.out.println("Key " + key + " has values: " + value1 + value2);
            }
        }
    }
    public static void main(String[] args) {
        HashMap<Integer, String> hii = new HashMap<>();
        hii.put(1, "A");
        hii.put(2, "B");
        hii.put(3, "C");
        HashMap<Integer, String> yii = new HashMap<>();
        yii.put(1, "A");
        yii.put(2, "D");
        yii.put(3, "C");
        find(hii, yii);
    }
}





