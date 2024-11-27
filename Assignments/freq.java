package programs;

import java.util.*;

public class freq {
    public static void countFreq(int arr[], int n) {
    boolean visited[] = new boolean[n];
    for (int i = 0; i < n; i++) {
        if (visited[i] == true)
            continue;
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                visited[j] = true;
                count++;
            }
        }
        System.out.println(arr[i] + " occurs " + count +" times ");
    }
}
    public static void main(String []args)
    {
        int arr[] = new int[]{10, 30, 10, 20, 10, 20, 30, 10};
        int n = arr.length;
        countFreq(arr, n);
        ArrayList looo=new ArrayList<>(Collections.singleton(arr));
        HashSet<Integer> noo = new HashSet<>();
        for (int i = 0; i < n; i++) {
            noo.add(arr[i]);
        }
        for (Integer i : noo) {
            System.out.println(i + 1);
        }

    }
}
