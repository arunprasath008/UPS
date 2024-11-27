package programs;


import java.util.*;

public class Test{
    static void Sort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 3, 2, 4, 1};
        int[] arr2 = {2, 6, 1, 7, 2};
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int c1 = i + j + 1;
        int[] c = new int[c1 + 1];
        int k = c1;

        while (i >= 0 || j >= 0) {
            if (i >= 0 && (j < 0 || arr1[i] >= arr2[j])) {
                c[k] = arr1[i];
                k--;
                i--;
            } else if (j >= 0) {
                c[k] = arr2[j];
                k--;
                j--;
            }
        }
        for(int l = 0; l <10; l++){
            System.out.print(c[l]);
        }
    }
}
